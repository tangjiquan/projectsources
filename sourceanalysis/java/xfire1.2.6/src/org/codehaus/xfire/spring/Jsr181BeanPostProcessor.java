package org.codehaus.xfire.spring;

import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.WebAnnotations;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.ServiceRegistry;
import org.codehaus.xfire.service.invoker.BeanInvoker;
import org.springframework.beans.BeansException;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * This BeanPostProcessor will create an XFire service from a service class if and only if
 * it is marked with the JSR 181 {@lit @}WebService attribute. This replaces the need for using the
 * ServiceComponent class.
 * 
 * @see org.codehaus.xfire.spring.ServiceBean
 * @author Jason Carreira <jcarreira@eplus.com>
 */
public class Jsr181BeanPostProcessor
    implements BeanPostProcessor
{
    private WebAnnotations annotations;

    private AnnotationServiceFactory serviceFactory;

    private ServiceRegistry registry;

    public Jsr181BeanPostProcessor(WebAnnotations annotations,
            AnnotationServiceFactory serviceFactory, ServiceRegistry registry)
    {
        this.annotations = annotations;
        this.serviceFactory = serviceFactory;
        this.registry = registry;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException
    {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException
    {
        try
        {
            Class clazz = SpringUtils.getUserTarget(bean).getClass();
            if (annotations.hasWebServiceAnnotation(clazz))
            {
                Service service = serviceFactory.create(clazz);
                service.setInvoker(new BeanInvoker(bean));
                registry.register(service);
            }
            return bean;
        }
        catch (Exception e)
        {
            throw new FatalBeanException("Could not get the target bean.", e);
        }
    }
}
