package daemon

import (
	"net"

	"github.com/docker/docker/daemon/networkdriver"
	"github.com/docker/docker/opts"
	flag "github.com/docker/docker/pkg/mflag"
)

const (
	defaultNetworkMtu    = 1500
	DisableNetworkBridge = "none"
)

// Config define the configuration of a docker daemon
// These are the configuration settings that you pass
// to the docker daemon when you launch it with say: `docker -d -e lxc`
// FIXME: separate runtime configuration from http api configuration
/**


Pidfile //Docker Daemon所属进程的PID文件
Root	//Docker运行时所使用的root路径
AutoRestart	//是否一直支持创建容器的重启
Dns	//为容器准备DNS Server地址
DnsSearch	//Docker使用指定的DNS查找地址
EnableIptables	//是否启用docker的iptables功能
EnableIpForward	//是否启用net.ipv4.ip_forward功能
DefaultIp		//绑定容器端口时使用的默认的IP
BridgeIface		//添加容器网络至已有的网桥接口名
BridgeIP		//创建网桥的IP地址
InterContainerCommunication	//是否允许宿主机上Docker容器间的通信
GraphDriver		//Docker Daemon运行时使用的特定存储驱动
GraphOptions	//可设置的存储驱动选项
ExecDriver		//Docker 运行时使用的特定exec驱动
Mtu				//设置容器网络接口的MTU
DisableNetwork	//是否支持docker容器的网络模式
EnableSelinuxSupport	//是否支持对SelLinux功能的支持
Context

*/
type Config struct {
	Pidfile                     string
	Root                        string
	AutoRestart                 bool
	Dns                         []string
	DnsSearch                   []string
	EnableIptables              bool
	EnableIpForward             bool
	DefaultIp                   net.IP
	BridgeIface                 string
	BridgeIP                    string
	InterContainerCommunication bool
	GraphDriver                 string
	GraphOptions                []string
	ExecDriver                  string
	Mtu                         int
	DisableNetwork              bool
	EnableSelinuxSupport        bool
	Context                     map[string][]string
}

// InstallFlags adds command-line options to the top-level flag parser for
// the current process.
// Subsequent calls to `flag.Parse` will populate config with values parsed
// from the command-line.
/**
选取InstllFlags()函数中参数的讲解
如：flag.StringVar(&config.Pidfile, []string{"p", "-pidfile"}, "/var/run/docker.pid", "Path to use for daemon PID file")
> 定义了一个StringVar类型的flag参数
> 该flag的名称为p或者是-pidfile
> 该flag的默认值为"/var/run/docker.pid",并将该值绑定到变量config.Pidfile
> 该flag的描述Path to use for daemon PID file


*/
func (config *Config) InstallFlags() {
	flag.StringVar(&config.Pidfile, []string{"p", "-pidfile"}, "/var/run/docker.pid", "Path to use for daemon PID file")
	flag.StringVar(&config.Root, []string{"g", "-graph"}, "/var/lib/docker", "Path to use as the root of the Docker runtime")
	flag.BoolVar(&config.AutoRestart, []string{"#r", "#-restart"}, true, "--restart on the daemon has been deprecated infavor of --restart policies on docker run")
	flag.BoolVar(&config.EnableIptables, []string{"#iptables", "-iptables"}, true, "Enable Docker's addition of iptables rules")
	flag.BoolVar(&config.EnableIpForward, []string{"#ip-forward", "-ip-forward"}, true, "Enable net.ipv4.ip_forward")
	flag.StringVar(&config.BridgeIP, []string{"#bip", "-bip"}, "", "Use this CIDR notation address for the network bridge's IP, not compatible with -b")
	flag.StringVar(&config.BridgeIface, []string{"b", "-bridge"}, "", "Attach containers to a pre-existing network bridge\nuse 'none' to disable container networking")
	flag.BoolVar(&config.InterContainerCommunication, []string{"#icc", "-icc"}, true, "Enable inter-container communication")
	flag.StringVar(&config.GraphDriver, []string{"s", "-storage-driver"}, "", "Force the Docker runtime to use a specific storage driver")
	flag.StringVar(&config.ExecDriver, []string{"e", "-exec-driver"}, "native", "Force the Docker runtime to use a specific exec driver")
	flag.BoolVar(&config.EnableSelinuxSupport, []string{"-selinux-enabled"}, false, "Enable selinux support. SELinux does not presently support the BTRFS storage driver")
	flag.IntVar(&config.Mtu, []string{"#mtu", "-mtu"}, 0, "Set the containers network MTU\nif no value is provided: default to the default route MTU or 1500 if no default route is available")
	opts.IPVar(&config.DefaultIp, []string{"#ip", "-ip"}, "0.0.0.0", "Default IP address to use when binding container ports")
	opts.ListVar(&config.GraphOptions, []string{"-storage-opt"}, "Set storage driver options")
	// FIXME: why the inconsistency between "hosts" and "sockets"?
	opts.IPListVar(&config.Dns, []string{"#dns", "-dns"}, "Force Docker to use specific DNS servers")
	opts.DnsSearchListVar(&config.DnsSearch, []string{"-dns-search"}, "Force Docker to use specific DNS search domains")
}

func GetDefaultNetworkMtu() int {
	if iface, err := networkdriver.GetDefaultRouteIface(); err == nil {
		return iface.MTU
	}
	return defaultNetworkMtu
}
