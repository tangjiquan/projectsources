package com.alibaba.jstorm.daemon.nimbus;

import java.io.IOException;
import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;
import org.apache.thrift7.protocol.TBinaryProtocol;
import org.apache.thrift7.server.THsHaServer;
import org.apache.thrift7.transport.TNonblockingServerSocket;
import org.apache.thrift7.transport.TTransportException;

import backtype.storm.Config;
import backtype.storm.generated.Nimbus;
import backtype.storm.generated.Nimbus.Iface;
import backtype.storm.scheduler.INimbus;
import backtype.storm.utils.BufferFileInputStream;
import backtype.storm.utils.TimeCacheMap;
import backtype.storm.utils.Utils;

import com.alibaba.jstorm.callback.AsyncLoopThread;
import com.alibaba.jstorm.client.ConfigExtension;
import com.alibaba.jstorm.cluster.StormConfig;
import com.alibaba.jstorm.daemon.supervisor.Httpserver;
import com.alibaba.jstorm.daemon.worker.hearbeat.SyncContainerHb;
import com.alibaba.jstorm.daemon.worker.metrics.UploadMetricFromZK;
import com.alibaba.jstorm.daemon.worker.metrics.MetricSendClient;
import com.alibaba.jstorm.daemon.worker.metrics.AlimonitorClient;
import com.alibaba.jstorm.schedule.CleanRunnable;
import com.alibaba.jstorm.schedule.FollowerRunnable;
import com.alibaba.jstorm.schedule.MonitorRunnable;
import com.alibaba.jstorm.utils.JStormServerUtils;
import com.alibaba.jstorm.utils.JStormUtils;
import com.alibaba.jstorm.utils.SmartThread;

/**
 * 
 * NimbusServer work flow: 1. cleanup interrupted topology delete
 * /storm-local-dir/nimbus/topologyid/stormdis delete
 * /storm-zk-root/storms/topologyid
 * 
 * 2. set /storm-zk-root/storms/topology stats as run
 * 
 * 3. start one thread, every nimbus.monitor.reeq.secs set
 * /storm-zk-root/storms/ all topology as monitor. when the topology's status is
 * monitor, nimubs would reassign workers 4. start one threa, every
 * nimubs.cleanup.inbox.freq.secs cleanup useless jar
 * 
 * @author version 1: Nathan Marz version 2: Lixin/Chenjun version 3: Longda
 * 
 * NimbusServer相当于hadoop里的JobTracker或者是yarn里的ResourceManager，在集群中属于首脑地位，负责
 * 任务的分发，监控集群状态，与supervisor的通信主要通过zookeeper。nimbus在启动过程中会做以下工作：
 * 1、清理无效的topology
 * 2、建立zk连接并创建znode
 * 3、启动监控线程
 * 4、启动httpserver
 * 
 */
public class NimbusServer {

	private static final Logger LOG = Logger.getLogger(NimbusServer.class);

	private NimbusData data;

	private ServiceHandler serviceHandler;

	private TopologyAssign topologyAssign;

	private THsHaServer thriftServer;

	private FollowerRunnable follower;

	private Httpserver hs;
	
	private UploadMetricFromZK uploadMetric;

	private List<SmartThread> smartThreads = new ArrayList<SmartThread>();

	private AtomicBoolean isShutdown = new AtomicBoolean(false);

	public static void main(String[] args) throws Exception {
		// read configuration files
		@SuppressWarnings("rawtypes")
		Map config = Utils.readStormConfig();//读取配置文件信息

		JStormServerUtils.startTaobaoJvmMonitor();

		NimbusServer instance = new NimbusServer();
		//处理资源分配的工具
		INimbus iNimbus = new DefaultInimbus();

		instance.launchServer(config, iNimbus);

	}

	private void createPid(Map conf) throws Exception {
		String pidDir = StormConfig.masterPids(conf);

		JStormServerUtils.createPid(pidDir);
	}

	@SuppressWarnings("rawtypes")
	private void launchServer(final Map conf, INimbus inimbus) {
		LOG.info("Begin to start nimbus with conf " + conf);

		try {
			// 1. check whether mode is distributed or not
			//1、检测集群配置是本地模式还是集群模式
			StormConfig.validate_distributed_mode(conf);
			// 清理pid目录，有参数storm.local.dir指定
			// 包含：a.创建本地进程pid文件，b.删除历史pid文件
			createPid(conf);
			// 初始化关闭钩子线程：里面包含各种清理操作
			initShutdownHook();
			//初始化ininumbus目录
			inimbus.prepare(conf, StormConfig.masterInimbus(conf));
			// 创建数据容器，存放各种统计信息，如：提交次数，集群状态，启动时长
			// 新建NimbusData数据，记录30s超时上传下载通道Channel/BufferFileInputStream
			data = createNimbusData(conf, inimbus);
			//启动fllower线程不断更新zk状态，如果发现自己不是leader则会关闭进程
			initFollowerThread(conf);
			//启动http服务器
			int port = ConfigExtension.getNimbusDeamonHttpserverPort(conf);
			hs = new Httpserver(port, conf);
			hs.start();
			//如果不是运行在yarn类似的容器中，不用关心该方法
			initContainerHBThread(conf);
			
			while (!data.isLeader())
				Utils.sleep(5000);
			
			//初始化监控线程
			initUploadMetricThread(data);
			//进程初始化，该方法会清理zk中残留的topology信息，初始化TopologyAssign线程负责分配任务
			init(conf);
		} catch (Throwable e) {
			LOG.error("Fail to run nimbus ", e);
		} finally {
			cleanup();
		}

		LOG.info("Quit nimbus");
	}

	public ServiceHandler launcherLocalServer(final Map conf, INimbus inimbus)
			throws Exception {
		LOG.info("Begin to start nimbus on local model");

		StormConfig.validate_local_mode(conf);

		inimbus.prepare(conf, StormConfig.masterInimbus(conf));

		data = createNimbusData(conf, inimbus);

		init(conf);

		return serviceHandler;
	}

	private void initContainerHBThread(Map conf) throws IOException {
		AsyncLoopThread thread = SyncContainerHb.mkNimbusInstance(conf);
		if (thread != null) {
			smartThreads.add(thread);
		}
	}

	private void init(Map conf) throws Exception {
		// nimbus本地不存在的stormids数据如果在2k上存在则删除，
		//其中删除操作包括/zk/[assignments,tasks,storms]相关数据
		NimbusUtils.cleanupCorruptTopologies(data);
		// 启动Toplogy分配策略，初始化TopogyAssign线程
		initTopologyAssign();
		// 初始化所有toplogy的状态为startup
		initTopologyStatus();
		//jar文件清理线程，默认每10分钟清理一次，清理目录：$LOCAL-DIR/nimbus/inbox
		// 启动clearner线程，默认600s扫描一次，默认删除3600s没有读写过的jar文件
		initCleaner(conf);
		// 初始化ServicesHandler
		serviceHandler = new ServiceHandler(data);

		if (!data.isLocalMode()) {
			// 监控所有task的heartbeat，一旦发现taskid失去心跳将其置为needreassign 1次/10s
			// 发现dead状态的则会清理掉释放资源
			initMonitor(conf);
			// 启动Thrift server
			initThrift(conf);

		}
	}

	@SuppressWarnings("rawtypes")
	private NimbusData createNimbusData(Map conf, INimbus inimbus)
			throws Exception {

		TimeCacheMap.ExpiredCallback<Object, Object> expiredCallback = new TimeCacheMap.ExpiredCallback<Object, Object>() {
			@Override
			public void expire(Object key, Object val) {
				try {
					LOG.info("Close file " + String.valueOf(key));
					if (val != null) {
						if (val instanceof Channel) {
							Channel channel = (Channel) val;
							channel.close();
						} else if (val instanceof BufferFileInputStream) {
							BufferFileInputStream is = (BufferFileInputStream) val;
							is.close();
						}
					}
				} catch (IOException e) {
					LOG.error(e.getMessage(), e);
				}

			}
		};

		int file_copy_expiration_secs = JStormUtils.parseInt(
				conf.get(Config.NIMBUS_FILE_COPY_EXPIRATION_SECS), 30);
		TimeCacheMap<Object, Object> uploaders = new TimeCacheMap<Object, Object>(
				file_copy_expiration_secs, expiredCallback);
		TimeCacheMap<Object, Object> downloaders = new TimeCacheMap<Object, Object>(
				file_copy_expiration_secs, expiredCallback);

		// Callback callback=new TimerCallBack();
		// StormTimer timer=Timer.mkTimerTimer(callback);
		NimbusData data = new NimbusData(conf, downloaders, uploaders, inimbus);

		return data;

	}

	private void initTopologyAssign() {
		topologyAssign = TopologyAssign.getInstance();
		topologyAssign.init(data);
	}

	private void initTopologyStatus() throws Exception {
		// get active topology in ZK
		List<String> active_ids = data.getStormClusterState().active_storms();

		if (active_ids != null) {

			for (String topologyid : active_ids) {
				// set the topology status as startup
				// in fact, startup won't change anything
				NimbusUtils.transition(data, topologyid, false,
						StatusType.startup);
			}

		}

		LOG.info("Successfully init topology status");
	}

	@SuppressWarnings("rawtypes")
	private void initMonitor(Map conf) {
		final ScheduledExecutorService scheduExec = data.getScheduExec();

		// Schedule Nimbus monitor
		MonitorRunnable r1 = new MonitorRunnable(data);

		int monitor_freq_secs = JStormUtils.parseInt(
				conf.get(Config.NIMBUS_MONITOR_FREQ_SECS), 10);
		scheduExec.scheduleAtFixedRate(r1, 0, monitor_freq_secs,
				TimeUnit.SECONDS);

		LOG.info("Successfully init Monitor thread");
	}

	/**
	 * Right now, every 600 seconds, nimbus will clean jar under
	 * /LOCAL-DIR/nimbus/inbox, which is the uploading topology directory
	 * 
	 * @param conf
	 * @throws IOException
	 */
	@SuppressWarnings("rawtypes")
	private void initCleaner(Map conf) throws IOException {
		final ScheduledExecutorService scheduExec = data.getScheduExec();

		// Schedule Nimbus inbox cleaner/nimbus/inbox jar
		String dir_location = StormConfig.masterInbox(conf);
		int inbox_jar_expiration_secs = JStormUtils.parseInt(
				conf.get(Config.NIMBUS_INBOX_JAR_EXPIRATION_SECS), 3600);
		CleanRunnable r2 = new CleanRunnable(dir_location,
				inbox_jar_expiration_secs);

		int cleanup_inbox_freq_secs = JStormUtils.parseInt(
				conf.get(Config.NIMBUS_CLEANUP_INBOX_FREQ_SECS), 600);

		scheduExec.scheduleAtFixedRate(r2, 0, cleanup_inbox_freq_secs,
				TimeUnit.SECONDS);

		LOG.info("Successfully init " + dir_location + " cleaner");
	}

	@SuppressWarnings("rawtypes")
	private void initThrift(Map conf) throws TTransportException {
		Integer thrift_port = JStormUtils.parseInt(conf
				.get(Config.NIMBUS_THRIFT_PORT));
		TNonblockingServerSocket socket = new TNonblockingServerSocket(
				thrift_port);

		Integer maxReadBufSize = JStormUtils.parseInt(conf
				.get(Config.NIMBUS_THRIFT_MAX_BUFFER_SIZE));

		THsHaServer.Args args = new THsHaServer.Args(socket);
		args.workerThreads(ServiceHandler.THREAD_NUM);
		args.protocolFactory(new TBinaryProtocol.Factory(false, true,
				maxReadBufSize));

		args.processor(new Nimbus.Processor<Iface>(serviceHandler));
		args.maxReadBufferBytes = maxReadBufSize;

		thriftServer = new THsHaServer(args);

		LOG.info("Successfully started nimbus: started Thrift server...");
		thriftServer.serve();
	}

	private void initFollowerThread(Map conf) {
		follower = new FollowerRunnable(data, 5000);
		Thread thread = new Thread(follower);
		thread.setDaemon(true);
		thread.start();
		LOG.info("Successfully init Follower thread");
	}

	private void initShutdownHook() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				NimbusServer.this.cleanup();
			}

		});
	}
	
	private void initUploadMetricThread(NimbusData data) {
		ScheduledExecutorService scheduleService = data.getScheduExec();
		
		MetricSendClient client;
		if (ConfigExtension.isAlimonitorMetricsPost(data.getConf())) {
		    client = new AlimonitorClient(AlimonitorClient.DEFAUT_ADDR, 
				    AlimonitorClient.DEFAULT_PORT, true);
		} else {
			client = new MetricSendClient();
		}
		
		uploadMetric = new UploadMetricFromZK(data, client);
		
		scheduleService.scheduleWithFixedDelay(uploadMetric, 120, 60, TimeUnit.SECONDS);
		
		LOG.info("Successfully init metrics uploading thread");
	}

	public void cleanup() {
		if (isShutdown.compareAndSet(false, true) == false) {
			LOG.info("Notify to quit nimbus");
			return;
		}

		LOG.info("Begin to shutdown nimbus");

		for (SmartThread t : smartThreads) {
			t.cleanup();
			JStormUtils.sleepMs(10);
			t.interrupt();
			try {
				t.join();
			} catch (InterruptedException e) {
				LOG.error("join thread", e);
			}
		}

		if (serviceHandler != null) {
			serviceHandler.shutdown();
		}

		if (topologyAssign != null) {
			topologyAssign.cleanup();
			LOG.info("Successfully shutdown TopologyAssign thread");
		}

		if (follower != null) {
			follower.clean();
			LOG.info("Successfully shutdown follower thread");
		}
		
		if (uploadMetric != null) {
			uploadMetric.clean();
			LOG.info("Successfully shutdown UploadMetric thread");
		}

		if (data != null) {
			data.cleanup();
			LOG.info("Successfully shutdown NimbusData");
		}

		if (thriftServer != null) {
			thriftServer.stop();
			LOG.info("Successfully shutdown thrift server");
		}

		if (hs != null) {
			hs.shutdown();
			LOG.info("Successfully shutdown httpserver");
		}

		LOG.info("Successfully shutdown nimbus");
		// make sure shutdown nimbus
		JStormUtils.halt_process(0, "!!!Shutdown!!!");

	}

}
