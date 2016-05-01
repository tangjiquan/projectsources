package org.codehaus.xfire.spring.remoting;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.ConnectException;
import java.net.MalformedURLException;

import org.aopalliance.aop.AspectException;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.codehaus.xfire.XFire;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.spring.ServiceBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.remoting.RemoteConnectFailureException;

/**
 * Interceptor for accessing a XFire SOAP service.
 *
 * @author <a href="mailto:poutsma@mac.com">Arjen Poutsma</a>
 * @see XFireExporter
 * @see XFireProxyFactory
 */
public class XFireClientInterceptor
        implements MethodInterceptor, InitializingBean
{
    private XFireProxyFactory proxyFactory;
    private Object xFireProxy;
    
    private String serviceUrl;
    private ServiceBean service;
    private XFire xfire;
    
    public void afterPropertiesSet()
            throws MalformedURLException
    {
        prepare();
    }

    /**
     * Initialize the XFire proxy for this interceptor.
     */
    public void prepare()
            throws MalformedURLException
    {
        if (getXfire() == null)
        {
            throw new IllegalArgumentException("xFire is required");
        }
        if (getServiceUrl() == null)
        {
            throw new IllegalArgumentException("serviceUrl is required");
        }
        if (this.proxyFactory == null)
        {
            this.proxyFactory = new XFireProxyFactory(getXfire());
        }
        this.xFireProxy = createXFireProxy(this.proxyFactory);
    }

    /**
     * Create the XFire proxy that is wrapped by this interceptor.
     *
     * @param proxyFactory the proxy factory to use
     * @return the Burlap proxy
     * @throws MalformedURLException if thrown by the proxy factory
     * @see XFireProxyFactory#create
     */
    protected Object createXFireProxy(XFireProxyFactory proxyFactory)
            throws MalformedURLException
    {
        return proxyFactory.create(getService().getXFireService(), getServiceUrl());
    }


    public Object invoke(MethodInvocation invocation)
            throws Throwable
    {
        if (this.xFireProxy == null)
        {
            throw new IllegalStateException("XFireClientInterceptor is not properly initialized - " +
                                            "invoke 'prepare' before attempting any operations");
        }

        try
        {
            return invocation.getMethod().invoke(this.xFireProxy, invocation.getArguments());
        }
        catch (InvocationTargetException ex)
        {
            if (ex.getTargetException() instanceof UndeclaredThrowableException)
            {
                UndeclaredThrowableException utex = (UndeclaredThrowableException) ex.getTargetException();
                throw convertBurlapAccessException(utex.getUndeclaredThrowable());
            }
            throw ex.getTargetException();
        }
        catch (Throwable ex)
        {
            throw new AspectException("Failed to invoke SOAP service [" + getServiceUrl() + "]", ex);
        }
    }

    /**
     * Convert the given Remote exception to an appropriate Spring RemoteAccessException.
     *
     * @param ex the exception to convert
     * @return the RemoteAccessException to throw
     */
    protected RemoteAccessException convertBurlapAccessException(Throwable ex)
    {
        if (ex instanceof ConnectException)
        {
            throw new RemoteConnectFailureException("Cannot connect to SOAP service at [" + getServiceUrl() + "]", ex);
        }
        else
        {
            throw new RemoteAccessException("Cannot access SOAP service at [" + getServiceUrl() + "]", ex);
        }
    }

    /**
     * Set the <code>XFireProxyFactory</code> instance to use. If not specified, a default
     * <code>XFireProxyFactory</code> will be created.
     *
     * @param proxyFactory the proxy factory
     */
    public void setProxyFactory(XFireProxyFactory proxyFactory)
    {
        this.proxyFactory = proxyFactory;
    }

    public String getServiceUrl()
    {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl)
    {
        this.serviceUrl = serviceUrl;
    }

    public ServiceBean getService()
    {
        return service;
    }

    public void setService(ServiceBean serviceBean)
    {
        this.service = serviceBean;
    }

    public XFire getXfire()
    {
        return xfire;
    }

    public void setXfire(XFire fire)
    {
        xfire = fire;
    }
}

