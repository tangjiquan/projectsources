package com.tachyon.test;

import java.io.IOException;

import com.sun.corba.se.spi.ior.Writeable;

import tachyon.TachyonURI;
import tachyon.client.FileOutStream;
import tachyon.client.InStream;
import tachyon.client.ReadType;
import tachyon.client.TachyonFS;
import tachyon.client.TachyonFile;
import tachyon.client.WriteType;

/**
 * 
 * @author Administrator
 *
 */
public class JavaAPITest {
	public final static  TachyonURI masterUri = new TachyonURI("tachyon://192.168.1.114:19998");
	public final static TachyonURI filePath = new TachyonURI("/tmp/test");
	public static WriteType writeType = WriteType.CACHE_THROUGH;
	public static ReadType readType = ReadType.CACHE;
	
	
	public static void writeFile() throws IOException {
		TachyonFS tachyonClient = TachyonFS.get(masterUri);
		if(tachyonClient.exist(filePath)){
			tachyonClient.delete(filePath, true);
		}
		tachyonClient.createFile(filePath);
		TachyonFile file = tachyonClient.getFile(filePath);
		FileOutStream os = (FileOutStream) file.getOutStream(writeType);
		for(int i=0; i<10; i++){
			os.write(Integer.toString(i).getBytes());
		}
		os.close();
		tachyonClient.close();
		
	}
	
	public static void readFile() throws IOException{
		TachyonFS tachyonClient = TachyonFS.get(masterUri);
		TachyonFile file = tachyonClient.getFile(filePath);
		InStream in = file.getInStream(readType);
		byte[] bytes = new byte[20];
		in.read(bytes);
		System.out.println(new String(bytes));
		in.close();
		tachyonClient.close();
	}
	
	public static void main(String[] args) throws IOException {
		writeFile();
		readFile();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
