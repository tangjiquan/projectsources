package org.codehaus.xfire.xmlbeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.wsdl.WSDLException;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlObject;
import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.SoapConstants;
import org.codehaus.xfire.transport.TransportManager;
import org.codehaus.xfire.util.jdom.StaxBuilder;
import org.codehaus.xfire.util.stax.FragmentStreamReader;
import org.codehaus.xfire.wsdl11.builder.WSDLBuilder;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.xpath.XPath;

public class XmlBeansWSDLBuilder
    extends WSDLBuilder
{
    private final static StaxBuilder builder = new StaxBuilder();
    private static Map schemas = new HashMap();
    
    private List importedSchemas = new ArrayList();
    
    public XmlBeansWSDLBuilder(Service service, TransportManager transportManager) throws WSDLException
    {
        super(service, transportManager);
    }

    public void addDependency(org.codehaus.xfire.wsdl.SchemaType type)
    {
        if (!hasDependency(type))
        {
            if (type instanceof XmlBeansType)
            {
                XmlBeansType xbeanType = (XmlBeansType) type;

                Element schema = getSchema(xbeanType);
                String ns = xbeanType.getSchemaType().getNamespaceURI();
                if (!importedSchemas.contains(schema))
                {
                    schema.detach();
                    setSchema(ns, schema);
                    
                    importedSchemas.add(schema);
                }
            }
        }
        
        super.addDependency(type);
    }
    
    public Element getSchema(XmlBeansType xbeanType)
    {
        SchemaType type = XmlBeans.typeForClass(xbeanType.getTypeClass());
        String name = type.getSourceName();
        if (name == null) return null;

        Element schema = (Element) schemas.get(name); 
        if (schema != null) return schema;
        
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try
        {
            XmlObject obj = XmlObject.Factory.parse(classLoader.getResourceAsStream("schemaorg_apache_xmlbeans/src/" + name));
            
            schema = builder.build(new FragmentStreamReader(obj.newXMLStreamReader())).getRootElement();
            
            String ns = xbeanType.getSchemaType().getNamespaceURI();
            String expr = "//xsd:schema[@targetNamespace='" + ns + "']";

            List nodes = getMatches(schema, expr);
            if (nodes.size() == 0)
            {
                return null;
            }
            
            schema = (Element) nodes.get(0);
            schemas.put(name, schema);
            
            return schema;
        }
        catch (Exception e)
        {
            throw new XFireRuntimeException("Couldn't load schema.", e);
        }
    }

    private List getMatches(Object doc, String xpath)
    {
        try
        {
            XPath path = XPath.newInstance(xpath);
            path.addNamespace("xsd", SoapConstants.XSD);
            path.addNamespace("s", SoapConstants.XSD);
            List result = path.selectNodes(doc);
            return result;
        }
        catch(JDOMException e)
        {
            throw new XFireRuntimeException("Error evaluating xpath " + xpath, e);
        }
    }
}
