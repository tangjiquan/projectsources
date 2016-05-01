package org.codehaus.xfire.transport.http;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xbean.spring.context.SpringApplicationContext;
import org.codehaus.xfire.XFire;
import org.codehaus.xfire.XFireException;
import org.codehaus.xfire.spring.XFireConfigLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;

/**
 * XFire Servlet as Dispatcher including a configuration<br>
 * of XFire from services.xml in classpath<br>
 * <p>
 */
public class XFireConfigurableServlet
    extends XFireServlet
{
    private static Log log = LogFactory.getLog(XFireConfigurableServlet.class);    
    
    private final static String CONFIG_FILE = "META-INF/xfire/services.xml";

    private final static String PARAM_CONFIG="config";
    
    /**
     * Path to configuration file 
     */
    private String configPath;
    
    /**
     * @return
     */
    private String getConfigPath()
    {
        if (configPath == null || configPath.length() == 0)
        {
            return CONFIG_FILE;
        }
        return configPath;
    }

	public XFire createXFire() throws ServletException 
	{
        configPath = getInitParameter(PARAM_CONFIG);
        XFire xfire;
        try 
        {
			xfire = loadConfig(getConfigPath());
		} 
		catch (XFireException e) 
		{
			throw new ServletException(e);
		}
        
        if(xfire == null || xfire.getServiceRegistry() == null || xfire.getServiceRegistry().getServices() == null || xfire.getServiceRegistry().getServices().size() == 0)
        {
            xfire = super.createXFire();
        }

        return xfire;
    }
    
    public XFire loadConfig(String configPath) throws XFireException
    {
        XFireConfigLoader loader = new XFireConfigLoader();
        loader.setBasedir(getWebappBase());
        log.debug("Loading configuration files relative to " + loader.getBasedir().getAbsolutePath());

        ServletContext servletCtx = getServletContext();
        ApplicationContext parent = (ApplicationContext) servletCtx.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

        if (parent == null)
        {
            GenericWebApplicationContext webCtx = new GenericWebApplicationContextX();
            webCtx.setServletContext(getServletContext());
            webCtx.refresh();
            parent = webCtx;
        }
        
        ApplicationContext newCtx = loader.loadContext(configPath, parent);
        if(servletCtx.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE) == null)
        {
             servletCtx.setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, newCtx);
        }

        XFire xfire = (XFire) newCtx.getBean("xfire");
        xfire.setProperty(XFire.XFIRE_HOME, getWebappBase().getAbsolutePath());
        return xfire;
    }
    
    public void destroy()
    {
        log.debug("Destroying XFireConfigurableServlet");
        ServletContext servletCtx = getServletContext();
        ApplicationContext appContext = (ApplicationContext)servletCtx.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        if (appContext != null &&
            appContext instanceof AbstractApplicationContext)
        {
            // shutdown the beans
            ((AbstractApplicationContext)appContext).close();
        }
        super.destroy();
    }

    public class GenericWebApplicationContextX extends GenericWebApplicationContext
        implements SpringApplicationContext
    {

        public GenericWebApplicationContextX()
        {
            super();
        }
        
    }
}
