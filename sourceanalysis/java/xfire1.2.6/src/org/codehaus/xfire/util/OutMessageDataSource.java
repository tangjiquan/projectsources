package org.codehaus.xfire.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataSource;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.codehaus.xfire.MessageContext;
import org.codehaus.xfire.XFireException;
import org.codehaus.xfire.exchange.OutMessage;
import org.codehaus.xfire.soap.Soap11;
import org.codehaus.xfire.soap.Soap12;
import org.codehaus.xfire.soap.SoapVersion;
import org.codehaus.xfire.transport.Channel;

/**
 * This will create a DataSource from a message for use in Attachments.
 * 
 * @author Dan Diephouse
 */
public class OutMessageDataSource implements DataSource
{
    private OutMessage msg;
    private MessageContext context;
    private InputStream is;
    private CachedOutputStream out;
    
    public OutMessageDataSource(MessageContext context2, OutMessage message) 
        throws XFireException
    {
        this.context = context2;
        this.msg = message;
        
        is = createInputStream();
    }

    public String getContentType()
    {
        String encoding = msg.getEncoding();
        if (encoding == null) encoding = "UTF-8";
        
        StringBuffer ct = new StringBuffer();
        ct.append("application/xop+xml; charset=")
          .append(encoding)
          .append("; type=\"")
          .append(getSoapContentType())
          .append("\"");
        
        return ct.toString();
    }
    
    public String getSoapContentType()
    {
        String ct;
        SoapVersion soap = msg.getSoapVersion();
        if (soap instanceof Soap11)
        {
            ct = "text/xml";
        }
        else if (soap instanceof Soap12)
        {
             return "application/soap+xml";
        }
        else
        {
            return "text/xml";
        }
        
        return ct;
    }
    
    public InputStream getInputStream()
        throws IOException
    {
        return is;
    }

    public InputStream createInputStream()
        throws XFireException
    {
        try
        {
           // TODO: its really not necessary to cache this...
           out = new CachedOutputStream(1024*1000, null);

           XMLStreamWriter writer = STAXUtils.createXMLStreamWriter(out, msg.getEncoding(), context);

           msg.setProperty(Channel.OUTPUTSTREAM, out);
           msg.getSerializer().writeMessage(msg, writer, context);
           
           writer.flush();
           writer.close();
           out.close();
           
           return out.getInputStream();
        }
        catch (XMLStreamException e)
        {
            throw new XFireException("Couldn't send message.", e);
        }
        catch (IOException e)
        {
            throw new XFireException("Couldn't send message.", e);
        }
    }

    public String getName()
    {
        return "soap.xml@xfire.codehaus.org";
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    public void dispose() 
    {
        out.dispose();
    }
}
