package org.codehaus.xfire.gen.jsr181;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.xfire.gen.GenerationContext;
import org.codehaus.xfire.gen.GenerationException;
import org.codehaus.xfire.gen.GeneratorPlugin;
import org.codehaus.xfire.gen.SchemaSupport;
import org.codehaus.xfire.service.Binding;
import org.codehaus.xfire.service.FaultInfo;
import org.codehaus.xfire.service.MessageInfo;
import org.codehaus.xfire.service.MessagePartInfo;
import org.codehaus.xfire.service.OperationInfo;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.ServiceInfo;
import org.codehaus.xfire.soap.AbstractSoapBinding;

import com.sun.codemodel.ClassType;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCommentPart;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPrimitiveType;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

public abstract class AbstractServiceGenerator
    extends AbstractPlugin
    implements GeneratorPlugin
{
    private static final Log log = LogFactory.getLog(AbstractServiceGenerator.class);

    private Service currentService;
    
    public void generate(GenerationContext context)
        throws Exception
    {
        for (Iterator itr = context.getServices().values().iterator(); itr.hasNext();)
        {
            List services = (List) itr.next();
            for (Iterator sitr = services.iterator(); sitr.hasNext();)
            {
                generate(context, (Service) sitr.next());
            }
        }
    }
    
    public void generate(GenerationContext context, Service service)
        throws Exception
    {
        for (Iterator itr = service.getBindings().iterator(); itr.hasNext();) 
        {
            Binding b = (Binding) itr.next();
            if (b instanceof AbstractSoapBinding)
            {
                generate(context, service, b);
            }
            else
            {
                log.info("Unknown binding: " + b.getClass().getName());
            }
        }
    }
    
    public void generate(GenerationContext context, Service service, Binding binding)
        throws Exception
    {
        setCurrentService(service);
        
        if (!isWritten(context));

        ServiceInfo serviceInfo = service.getServiceInfo();

        String clsName = getClassName(context, service);
        log.info("Creating class " + clsName);

        File classFile = new File(context.getOutputDirectory(), clsName.replace('.', File.separatorChar) + ".java");
        
        if (classFile.exists() && !overwriteClass(context, service, clsName, classFile))
        {
            return;
        }
        
        JDefinedClass jc = context.getCodeModel()._class(clsName, getClassType());
        
        SchemaSupport schema = context.getSchemaGenerator();
        String documentation = service.getServiceInfo().getDocumentation();
        if( documentation != null ){
            jc.javadoc().add(documentation);    
        }
        
        annotate(context, service, jc, binding);
        
        // Process operations
        for (Iterator itr = serviceInfo.getOperations().iterator(); itr.hasNext();)
        {
            OperationInfo op = (OperationInfo) itr.next();
            
            JType returnType = getReturnType(context, schema, op);
            
            String name = javify(op.getName());
            name = name.substring(0, 1).toLowerCase() + name.substring(1);
            
            JMethod method = jc.method(JMod.PUBLIC, returnType, name);
            
            String opDocumentation = op.getDocumenation();
            if( opDocumentation != null ){
                method.javadoc().add(opDocumentation);
            }
            annotate(context, op, method);
            
            generateOperation(context, op, method);
        }
    }

    protected boolean overwriteClass(GenerationContext context, Service service, String clsName, File classFile)
    {
        return true;
    }


    public Service getCurrentService()
    {
        return currentService;
    }

    public void setCurrentService(Service currentService)
    {
        this.currentService = currentService;
    }

    protected boolean isWritten(GenerationContext context)
    {
        return false;
    }
    public static  class ParamInfo{
    	private JType paramType;
    	private String varName;
    	private boolean in;
    	private boolean out;
    	private boolean header;
    	private QName name;
    	private MessagePartInfo part;
    	
    	public ParamInfo(JType paramType, String name){
    	 this.paramType = paramType;
    	 this.varName = name;
    	}

    	public ParamInfo(JType paramType, String name, boolean header){
       	 this(paramType,name);
       	 this.header = header;
       	}
    	
    	
    	
		public MessagePartInfo getPart() {
			return part;
		}

		public void setPart(MessagePartInfo part) {
			this.part = part;
		}

		public void setParamType(JType paramType) {
			this.paramType = paramType;
		}

		public QName getName() {
			return name;
		}

		public void setName(QName name) {
			this.name = name;
		}

		public boolean isHeader() {
			return header;
		}

		public void setHeader(boolean header) {
			this.header = header;
		}

		public boolean isIn() {
			return in;
		}

		public void setIn(boolean in) {
			this.in = in;
		}

		public boolean isOut() {
			return out;
		}

		public void setOut(boolean out) {
			this.out = out;
		}

		public JType getParamType() {
			return paramType;
		}

		public String getVarName() {
			return varName;
		}
    	
    }

    private void generateOperation(GenerationContext context, OperationInfo op, JMethod method) 
        throws GenerationException
    {
        Collection bindings = getCurrentService().getBindings();
        SchemaSupport schema = context.getSchemaGenerator();
        
        List<String> partNames = new ArrayList<String>();
        
        Map<String, ParamInfo> params = new HashMap<String, ParamInfo>();
        // input parts
        MessageInfo inputMsg = op.getInputMessage();
        for (Iterator pitr = inputMsg.getMessageParts().iterator(); pitr.hasNext();)
        {
            MessagePartInfo part = (MessagePartInfo) pitr.next();
            
            String varName = getUniqueName(javify(part.getName().getLocalPart()), partNames);
            partNames.add(varName);

            JType paramType = schema.getType(context, part);
            ParamInfo param = new ParamInfo(paramType,varName);
            param.setIn(true);
            param.setName(part.getName());
            param.setPart(part);
            params.put(varName, param );

        }
   
        // input parts for each binding
        for (Iterator itr = bindings.iterator(); itr.hasNext();)
        {
            Binding binding = (Binding) itr.next();
            annotate(context, op, method, binding);
            
            List headers = binding.getHeaders(inputMsg).getMessageParts();
            for (Iterator bitr = headers.iterator(); bitr.hasNext();)
            {
                MessagePartInfo part = (MessagePartInfo) bitr.next(); 
                
                String varName = getUniqueName(javify(part.getName().getLocalPart()), partNames);
                partNames.add(varName);

                JType paramType = schema.getType(context, part);

                ParamInfo param = new ParamInfo(paramType,varName, true);
                param.setIn(true);
                param.setName(part.getName());
                param.setPart(part);
                params.put(varName, param);
                
            }
        }

        if (op.hasOutput() && op.getOutputMessage().size() > 0)
        {
            MessageInfo outputMsg = op.getOutputMessage();
            Iterator rtitr = outputMsg.getMessageParts().iterator();
            MessagePartInfo returnPart = (MessagePartInfo) rtitr.next();
            
            annotateReturnType(method, returnPart);
            
            for (Iterator itr = bindings.iterator(); itr.hasNext();)
            {
                annotateReturnType(method, returnPart, (Binding) itr.next());
            }

            while (rtitr.hasNext())
            {
                MessagePartInfo part = (MessagePartInfo) rtitr.next();
                
                String varName = getUniqueName(javify(part.getName().getLocalPart()), partNames);
                partNames.add(varName);

                JType paramType = getHolderType(context, part);
                
                ParamInfo param = params.get(varName);
                if( param == null ){
                	param = new ParamInfo(paramType,varName);	
                }
                param.setOut(true);
                param.setName(part.getName());
                param.setPart(part);
                params.put(varName, param);
                
            } 

            // Annotate out message bindings
            for (Iterator itr = bindings.iterator(); itr.hasNext();)
            {
                Binding binding = (Binding) itr.next();
                List headers = binding.getHeaders(outputMsg).getMessageParts();
                for (Iterator bitr = headers.iterator(); bitr.hasNext();)
                {
                    MessagePartInfo part = (MessagePartInfo) bitr.next(); 
                  
                    String localName = part.getName().getLocalPart();
                    String varName = localName;
                    
                    
                    	// The same name used for input/output paramter
                    		
                     boolean foundMatch = false;
                     
                     if (partNames.contains(localName)){
                    	for (ParamInfo param : params.values()) {
            			   	String name = param.getPart().getName().getLocalPart();
            			   	if( localName.equals(name) && param.getPart().getIndex() == part.getIndex()){
            			   		varName = param.getVarName();
            			   		foundMatch = true;
            			   		break;
            			   	}
            			}	
                    }
                     
                     if( !foundMatch){
                    	 varName = getUniqueName(javify(localName), partNames);	
                         partNames.add(varName); 
                     }
                    JType paramType = getHolderType(context, part);
                    
                    ParamInfo param = params.get(varName);
                    if( param == null ){
                    	param = new ParamInfo(paramType,varName,true);	
                    }
                    param.setOut(true);
                    param.setName(part.getName());
                    param.setParamType(paramType);
                    params.put(varName, param);

                }
            }
            
           
           }
        else if (!op.hasOutput())
        {
            annotateOneWay(method);
        }
        for (String name: partNames) {
        	ParamInfo param = params.get(name);
        	JVar jvar = method.param(0, param.getParamType(), param.getVarName());
        	annotateParam(param, jvar);
			
		}   
        
        generateFaults(context, op, method);
    }

    protected void annotateOneWay(JMethod method) 
    {
    }

    protected void annotateParam(ParamInfo param, JVar jvar ){
    	
    }
    protected JType getHolderType(GenerationContext context,MessagePartInfo part)
        throws GenerationException
    {
        JType genericType = context.getSchemaGenerator().getType(context, part);
        
        try {
            JClass holder = context.getCodeModel().ref("javax.xml.ws.Holder");
            if (genericType instanceof JPrimitiveType) {
            	genericType = ((JPrimitiveType) genericType).boxify();
            }
            holder = holder.narrow((JClass) genericType);
            return holder;
        } catch (Exception e) {
            throw new GenerationException("Could not find holder type.", e);
        }
    }

    protected void generateFaults(GenerationContext context, OperationInfo op, JMethod method)
        throws GenerationException
    {
        for (Iterator itr = op.getFaults().iterator(); itr.hasNext();)
        {
            FaultInfo faultInfo = (FaultInfo) itr.next();
            
            //List messageParts = faultInfo.getMessageParts();
            /*if (messageParts.size() > 1)
            {
                throw new GenerationException("Operation " + op.getName() + " has a fault " + faultInfo.getName() + 
                                              " with multiple parts. This is not supported at this time.");
            }*/
            
            JClass exCls = getExceptionClass(context, faultInfo);
            
            if (exCls == null)
                throw new GenerationException("Could not find generated " +
                        "fault class for " + faultInfo.getName() + "!");
            
            if( faultInfo.getDocumentation()!= null){
             JCommentPart commentPart = method.javadoc().addThrows(exCls);
             commentPart.add(faultInfo.getDocumentation());
             
            }
            
            method._throws(exCls);
        }
    }

    private JClass getExceptionClass(GenerationContext context, FaultInfo faultInfo)
    {
        Map<String,JClass> exClasses = (Map<String,JClass>) 
            context.getProperty(FaultGenerator.EXCEPTION_CLASSES);
        
        return exClasses.get(faultInfo.getMessageName());
    }

    private String getUniqueName(String varName, List<String> partNames)
    {
        if (!partNames.contains(varName)) return varName;
        
        for (int i = 2; true; i++)
        {
            String v2 = varName + i;
            if (!partNames.contains(v2))
            {
                return v2;
            }
        }
    }

    protected abstract String getClassName(GenerationContext context, Service service);

    protected abstract ClassType getClassType();

    protected void annotate(GenerationContext context, OperationInfo op, JMethod method)
    {
    }
    
    protected void annotate(GenerationContext context, OperationInfo op, JMethod method, Binding binding)
    {
    }

    protected void annotateOutParam(MessagePartInfo part, JVar jvar)
    {
    }
    
    protected void annotateOutParam(MessagePartInfo part, JVar jvar, Binding binding)
    {
    }

    protected void annotateInOutParam(MessagePartInfo part, JVar jvar, Binding binding)
    {
    }
    
    protected void annotateReturnType(JMethod method, MessagePartInfo returnPart)
    {
    }

    protected void annotateReturnType(JMethod method, MessagePartInfo returnPart, Binding binding)
    {
    }
    
    protected void annotate(MessagePartInfo part, JVar jvar)
    {
    }
    
    protected void annotate(MessagePartInfo part, JVar jvar, Binding binding)
    {
    }
    
    /**
     * Find the return type for the operation. If there is no output message void is returned.
     */
    protected JType getReturnType(GenerationContext context, SchemaSupport schema, OperationInfo op)
        throws GenerationException
    {
        JType returnType;
        if (op.hasOutput() && op.getOutputMessage().size() > 0)
        {
            MessagePartInfo returnPart = 
                (MessagePartInfo) op.getOutputMessage().getMessageParts().iterator().next();

            returnType = schema.getType(context, returnPart);
        }
        else
        {
            returnType = context.getCodeModel().VOID;
        }
        
        return returnType;
    }

    protected void annotate(GenerationContext context, Service service, JDefinedClass jc, Binding binding)
    {
    }

}
