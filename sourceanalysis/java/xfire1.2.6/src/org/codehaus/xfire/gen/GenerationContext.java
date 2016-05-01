package org.codehaus.xfire.gen;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;

import javax.xml.namespace.QName;

import org.codehaus.xfire.AbstractContext;
import org.codehaus.xfire.service.Service;

import com.sun.codemodel.JCodeModel;

public class GenerationContext
    extends AbstractContext
{
    private JCodeModel codeModel;

    private Map<QName, Collection<Service>> services;

    private Object wsdl;

    private String destinationPackage;

    private String baseURI;

    private SchemaSupport schemaGenerator;

    private File outputDirectory;

    private String wsdlLocation;

    private Collection schemas;

    private Map<String, InputStream> externalBindings;

    private boolean explicitAnnotation;

    private boolean serverStubGenerated = true;
    
    private boolean serverStubOverwritten = false;
    
    private boolean descriptorOverwritten = false;
    
    public GenerationContext(JCodeModel model, Object wsdl)
    {
        codeModel = model;
        this.wsdl = wsdl;
    }

    public String getBaseURI()
    {
        return baseURI;
    }

    public void setBaseURI(String baseURI)
    {
        this.baseURI = baseURI;
    }

    public Collection getSchemas()
    {
        return schemas;
    }

    public void setSchemas(Collection schemas)
    {
        this.schemas = schemas;
    }

    public String getWsdlLocation()
    {
        return wsdlLocation;
    }

    public void setWsdlLocation(String wsdlLocation)
    {
        this.wsdlLocation = wsdlLocation;
    }

    public File getOutputDirectory()
    {
        return outputDirectory;
    }

    public void setOutputDirectory(File outputDirectory)
    {
        this.outputDirectory = outputDirectory;
    }

    public JCodeModel getCodeModel()
    {
        return codeModel;
    }

    public void setCodeModel(JCodeModel codeModel)
    {
        this.codeModel = codeModel;
    }

    public Map<QName, Collection<Service>> getServices()
    {
        return services;
    }

    public void setServices(Map<QName, Collection<Service>> services)
    {
        this.services = services;
    }

    public Object getWsdl()
    {
        return wsdl;
    }

    public File getBaseDir()
    {
        return new File(".");
    }

    public String getDestinationPackage()
    {
        return destinationPackage;
    }

    public void setDestinationPackage(String destinationPackage)
    {
        this.destinationPackage = destinationPackage;
    }

    public SchemaSupport getSchemaGenerator()
    {
        return schemaGenerator;
    }

    public void setSchemaGenerator(SchemaSupport schemaGenerator)
    {
        this.schemaGenerator = schemaGenerator;
    }

    public Map<String, InputStream> getExternalBindings()
    {
        return externalBindings;
    }

    public void setExternalBindings(Map<String, InputStream> externalBindings)
    {
        this.externalBindings = externalBindings;
    }

    public boolean isExplicitAnnotation()
    {
        return explicitAnnotation;
    }

    public void setExplicitAnnotation(boolean explicitAnnotation)
    {
        this.explicitAnnotation = explicitAnnotation;
    }

    public boolean isServerStubOverwritten()
    {
        return serverStubOverwritten;
    }

    public void setServerStubOverwritten(boolean serverStubOverwritten)
    {
        this.serverStubOverwritten = serverStubOverwritten;
    }

    public boolean isDescriptorOverwritten()
    {
        return descriptorOverwritten;
    }

    public void setDescriptorOverwritten(boolean descriptorOverwritten)
    {
        this.descriptorOverwritten = descriptorOverwritten;
    }

    public boolean isServerStubGenerated()
    {
        return serverStubGenerated;
    }

    public void setServerStubGenerated(boolean serverStubGenerated)
    {
        this.serverStubGenerated = serverStubGenerated;
    }
}
