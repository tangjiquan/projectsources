package org.codehaus.xfire.spring.remoting;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;

import org.codehaus.xfire.XFire;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.transport.http.XFireServletController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * An adapter for the {@link XFireServletController} so that it conforms to Springs MVC {@link Controller} interface.
 *
 * @author <a href="mailto:dan@envoisolutions.com">Dan Diephouse</a>
 * @author <a href="mailto:poutsma@mac.com">Arjen Poutsma</a>
 */
public class XFireServletControllerAdapter
        extends XFireServletController
        implements Controller
{
    private QName serviceName;

    /**
     * Initializes a new instance of the adapter with the given XFire instance and service name.
     *
     * @param xfire       the XFire instance
     * @param serviceName the name of the service
     */
    public XFireServletControllerAdapter(XFire xfire, QName serviceName)
    {
        this(xfire, null, serviceName);
    }

    /**
     * Initializes a new instance of the adapter with the given XFire instance.
     *
     * @param xfire       the XFire instance
     * @param name 
     * @param context 
     */
    public XFireServletControllerAdapter(XFire xfire, ServletContext context, QName name)
    {
        super(xfire, context);
        
        this.serviceName = name;
    }
    
    protected String getService(HttpServletRequest request)
    {
        return serviceName.getLocalPart();
    }

    /**
     * Process the incoming SOAP request and create a SOAP response.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @return <code>null</code>
     * @throws Exception in case of errors
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws Exception
    {
        doService(request, response);
        return null;
    }
    
    protected Service getService(String name)
    {
        return getServiceRegistry().getService(serviceName);
    }

    public void setServiceName(QName serviceName)
    {
        this.serviceName = serviceName;
    }
}
