package builtins

import (
	"runtime"

	"github.com/docker/docker/api"
	apiserver "github.com/docker/docker/api/server"
	"github.com/docker/docker/daemon/networkdriver/bridge"
	"github.com/docker/docker/dockerversion"
	"github.com/docker/docker/engine"
	"github.com/docker/docker/events"
	"github.com/docker/docker/pkg/parsers/kernel"
	"github.com/docker/docker/registry"
)

//向engine注册多个Handler，包括Docker Daemon宿主机的网络初始化，Web API服务，事件查询，版本查看
//Docker Register的验证与搜索等
func Register(eng *engine.Engine) error {
	if err := daemon(eng); err != nil { //注册网络初始化处理方法
		return err
	}
	if err := remote(eng); err != nil { //注册API服务处理方法
		return err
	}
	if err := events.New().Install(eng); err != nil { //注册events事件处理方法
		return err
	}
	if err := eng.Register("version", dockerVersion); err != nil {
		return err
	}
	return registry.NewService().Install(eng) //注册register处理方法
}

// remote: a RESTful api for cross-docker communication
func remote(eng *engine.Engine) error {
	if err := eng.Register("serveapi", apiserver.ServeApi); err != nil {
		return err
	}
	return eng.Register("acceptconnections", apiserver.AcceptConnections)
}

// daemon: a default execution and storage backend for Docker on Linux,
// with the following underlying components:
//
// * Pluggable storage drivers including aufs, vfs, lvm and btrfs.
// * Pluggable execution drivers including lxc and chroot.
//
// In practice `daemon` still includes most core Docker components, including:
//
// * The reference registry client implementation
// * Image management
// * The build facility
// * Logging
//
// These components should be broken off into plugins of their own.
//
func daemon(eng *engine.Engine) error {
	return eng.Register("init_networkdriver", bridge.InitDriver)
}

// builtins jobs independent of any subsystem
func dockerVersion(job *engine.Job) engine.Status {
	v := &engine.Env{}
	v.SetJson("Version", dockerversion.VERSION)
	v.SetJson("ApiVersion", api.APIVERSION)
	v.Set("GitCommit", dockerversion.GITCOMMIT)
	v.Set("GoVersion", runtime.Version())
	v.Set("Os", runtime.GOOS)
	v.Set("Arch", runtime.GOARCH)
	if kernelVersion, err := kernel.GetKernelVersion(); err == nil {
		v.Set("KernelVersion", kernelVersion.String())
	}
	if _, err := v.WriteTo(job.Stdout); err != nil {
		return job.Error(err)
	}
	return engine.StatusOK
}