// +build daemon

package main

import (
	"log"

	"github.com/docker/docker/builtins"
	"github.com/docker/docker/daemon"
	_ "github.com/docker/docker/daemon/execdriver/lxc"
	_ "github.com/docker/docker/daemon/execdriver/native"
	"github.com/docker/docker/dockerversion"
	"github.com/docker/docker/engine"
	flag "github.com/docker/docker/pkg/mflag"
	"github.com/docker/docker/pkg/signal"
)

const CanDaemon = true

var (
	daemonCfg = &daemon.Config{} //代表docker daemon的配置信息
)

func init() {
	daemonCfg.InstallFlags()
}

/**
1. deamon配置初始化，该部分在init()函数中执行的
2. 命令行flag参数的检查
3. 创建engine对象
4. 设置engine的信号量捕捉及处理方法
5. 加载builtins
6. 使用goroutine加载deamon对象并运行
7. 打印docker的版本及驱动信息
8. serveapi的创建与运行



*/
func mainDaemon() {
	//判断剩余的参数是否为0，如果为0说明docker daemon的启动的参数，如果不为0，说明启动
	//docker daemon的时候，传入多于的参数
	if flag.NArg() != 0 {
		flag.Usage()
		return
	}
	eng := engine.New()
	signal.Trap(eng.Shutdown)
	// Load builtins
	//builtins表示在运行过程中注册一些任务job，这部分任务一般与容器的运行无关，与Docker Daemon运行时信息有关
	if err := builtins.Register(eng); err != nil {
		log.Fatal(err)
	}

	// load the daemon in the background so we can immediately start
	// the http api so that connections don't fail while the daemon
	// is booting
	go func() {
		d, err := daemon.NewDaemon(daemonCfg, eng)
		if err != nil {
			log.Fatal(err)
		}
		if err := d.Install(eng); err != nil {
			log.Fatal(err)
		}
		// after the daemon is done setting up we can tell the api to start
		// accepting connections
		//通知init守护进程，使Docker Daemon开始接受请求
		if err := eng.Job("acceptconnections").Run(); err != nil {
			log.Fatal(err)
		}
	}()
	// TODO actually have a resolved graphdriver to show?
	log.Printf("docker daemon: %s %s; execdriver: %s; graphdriver: %s",
		dockerversion.VERSION,
		dockerversion.GITCOMMIT,
		daemonCfg.ExecDriver,
		daemonCfg.GraphDriver,
	)

	// Serve api
	job := eng.Job("serveapi", flHosts...)
	job.SetenvBool("Logging", true)
	job.SetenvBool("EnableCors", *flEnableCors)
	job.Setenv("Version", dockerversion.VERSION)
	job.Setenv("SocketGroup", *flSocketGroup)

	job.SetenvBool("Tls", *flTls)
	job.SetenvBool("TlsVerify", *flTlsVerify)
	job.Setenv("TlsCa", *flCa)
	job.Setenv("TlsCert", *flCert)
	job.Setenv("TlsKey", *flKey)
	job.SetenvBool("BufferRequests", true)
	if err := job.Run(); err != nil {
		log.Fatal(err)
	}
}
