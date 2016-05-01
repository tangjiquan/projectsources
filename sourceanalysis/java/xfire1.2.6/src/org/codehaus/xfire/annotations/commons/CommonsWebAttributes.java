package org.codehaus.xfire.annotations.commons;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.attributes.Attributes;
import org.codehaus.xfire.annotations.HandlerChainAnnotation;
import org.codehaus.xfire.annotations.WebAnnotations;
import org.codehaus.xfire.annotations.WebMethodAnnotation;
import org.codehaus.xfire.annotations.WebParamAnnotation;
import org.codehaus.xfire.annotations.WebResultAnnotation;
import org.codehaus.xfire.annotations.WebServiceAnnotation;
import org.codehaus.xfire.annotations.commons.soap.SOAPBinding;
import org.codehaus.xfire.annotations.soap.SOAPBindingAnnotation;

/**
 * Implementation of the {@link WebAnnotations} facade for Commons Attributes.
 *
 * @author <a href="mailto:poutsma@mac.com">Arjen Poutsma</a>
 */
public class CommonsWebAttributes
        implements WebAnnotations
{

    public boolean hasWebServiceAnnotation(Class aClass)
    {
        return Attributes.hasAttributeType(aClass, WebService.class);
    }

    public WebServiceAnnotation getWebServiceAnnotation(Class aClass)
    {
        return (WebServiceAnnotation) Attributes.getAttribute(aClass, WebService.class);
    }

    public boolean hasWebMethodAnnotation(Method method)
    {
        return Attributes.hasAttributeType(method, WebMethod.class);
    }

    public WebMethodAnnotation getWebMethodAnnotation(Method method)
    {
        return (WebMethodAnnotation) Attributes.getAttribute(method, WebMethod.class);
    }

    public boolean hasWebResultAnnotation(Method method)
    {
        return Attributes.hasReturnAttributeType(method, WebResult.class);
    }

    public WebResultAnnotation getWebResultAnnotation(Method method)
    {
        return (WebResultAnnotation) Attributes.getReturnAttribute(method, WebResult.class);
    }

    public boolean hasWebParamAnnotation(Method method, int parameter)
    {
        return Attributes.hasParameterAttributeType(method, parameter, WebParam.class);
    }

    public WebParamAnnotation getWebParamAnnotation(Method method, int parameter)
    {
        return (WebParamAnnotation) Attributes.getParameterAttribute(method, parameter, WebParam.class);
    }

    public boolean hasOnewayAnnotation(Method method)
    {
        return Attributes.hasAttributeType(method, Oneway.class);
    }

    public boolean hasSOAPBindingAnnotation(Class aClass)
    {
        return Attributes.hasAttributeType(aClass, SOAPBinding.class);
    }

    public SOAPBindingAnnotation getSOAPBindingAnnotation(Class aClass)
    {
        return (SOAPBindingAnnotation) Attributes.getAttribute(aClass, SOAPBinding.class);
    }

    public boolean hasHandlerChainAnnotation(Class aClass)
    {
        return Attributes.hasAttributeType(aClass, HandlerChain.class);
    }

    public HandlerChainAnnotation getHandlerChainAnnotation(Class aClass)
    {
        return (HandlerChainAnnotation) Attributes.getAttribute(aClass, HandlerChain.class);
    }

	public Map getServiceProperties(Class clazz) {

		return null;
	}

    public Collection getFaultHandlers(Class clazz)
    {
        // TODO Auto-generated method stub
        return Collections.EMPTY_LIST;
    }

    public Collection getInHandlers(Class clazz)
    {
        // TODO Auto-generated method stub
        return Collections.EMPTY_LIST;
    }

    public Collection getOutHandlers(Class clazz)
    {
        // TODO Auto-generated method stub
        return Collections.EMPTY_LIST;
    }
}
