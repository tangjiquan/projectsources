package org.codehaus.xfire.spring.config;

import java.lang.reflect.Constructor;

import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.service.ServiceFactory;
import org.codehaus.xfire.service.binding.BindingProvider;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.codehaus.xfire.transport.TransportManager;
import org.codehaus.xfire.util.ClassLoaderUtils;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author <a href="mailto:tsztelak@gmail.com">Tomasz Sztelak</a>
 * 
 */
public class ServiceFactoryBean
    implements FactoryBean
{

    private static final String JSR181_FACTORY = "jsr181";

    private static final String COMMONS_FACTORY = "commons-attributes";

    private String name;

    private TransportManager transportManager;

    ObjectServiceFactory factory;

    public ServiceFactoryBean(String name)
    {
        this.name = name;
    }

    public TransportManager getTransportManager()
    {
        return transportManager;
    }

    public void setTransportManager(TransportManager transportManager)
    {
        this.transportManager = transportManager;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.FactoryBean#getObject()
     */
    public Object getObject()
        throws Exception
    {
        if (factory == null)
        {
            initialize();
        }
        
        return factory;
    }

    /**
     * @org.xbean.InitMethod
     * @throws Exception
     */
    public void initialize()
        throws Exception
    {
        String serviceFactory = name;
        if (JSR181_FACTORY.equals(serviceFactory) || COMMONS_FACTORY.equals(serviceFactory))
            factory = getAnnotationServiceFactory(serviceFactory);
        else
            factory = loadServiceFactory(serviceFactory);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.FactoryBean#getObjectType()
     */
    public Class getObjectType()
    {
        return ServiceFactory.class;
    }

    public boolean isSingleton()
    {
        return false;
    }

    /**
     * @param annotationType
     * @param bindingProvider
     * @return
     * @throws Exception
     */
    protected ObjectServiceFactory getAnnotationServiceFactory(String annotationType)
        throws Exception
    {
        Class annotsClz = null;
        Class clz = loadClass("org.codehaus.xfire.annotations.AnnotationServiceFactory");

        if (JSR181_FACTORY.equals(annotationType))
        {
            annotsClz = loadClass("org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations");
        }
        else if (COMMONS_FACTORY.equals(annotationType))
        {
            annotsClz = loadClass("org.codehaus.xfire.annotations.commons.CommonsWebAttributes");
        }

        Class webAnnot = loadClass("org.codehaus.xfire.annotations.WebAnnotations");

        Constructor con = clz.getConstructor(new Class[] { webAnnot, TransportManager.class,
                BindingProvider.class });

        return (ObjectServiceFactory) con.newInstance(new Object[] { annotsClz.newInstance(),
                getTransportManager(), null });
    }

    /**
     * @param bindingProvider
     * @param serviceFactoryName
     * @return
     */
    protected ObjectServiceFactory loadServiceFactory(String serviceFactoryName)
    {
        ObjectServiceFactory factory = null;
        if (serviceFactoryName.length() > 0)
        {
            // Attempt to load a ServiceFactory for the user.
            try
            {
                Class clz = loadClass(serviceFactoryName);
                TransportManager tman = getTransportManager();

                Constructor con = null;
                Object[] arguments = null;

                try
                {
                    con = clz.getConstructor(new Class[] { TransportManager.class,
                            BindingProvider.class });
                    arguments = new Object[] { tman, null };
                }
                catch (NoSuchMethodException e)
                {
                    try
                    {
                        con = clz.getConstructor(new Class[] { TransportManager.class });
                        arguments = new Object[] { tman };
                    }
                    catch (NoSuchMethodException e1)
                    {
                        con = clz.getConstructor(new Class[0]);
                        arguments = new Object[0];
                    }
                }

                factory = (ObjectServiceFactory) con.newInstance(arguments);
            }
            catch (Exception e)
            {
                throw new XFireRuntimeException("Could not load service factory: "
                        + serviceFactoryName, e);
            }
        }
        else
        {
            throw new XFireRuntimeException("serviceFactory element cannot be empty.");
        }

        return factory;
    }

    protected Class loadClass(String className)
        throws Exception
    {
        // Handle array'd types.
        if (className.endsWith("[]"))
        {
            className = "[L" + className.substring(0, className.length() - 2) + ";";
        }

        return ClassLoaderUtils.loadClass(className, getClass());
    }

}
