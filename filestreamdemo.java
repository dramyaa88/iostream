package demo.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filestreamdemo {
	File file = new File("MyFile.txt");
	FileOutputStream fos;
	FileInputStream fis;

	public void writeOperation()
	{
		try
		{
		fos = new FileOutputStream(file,true);
		String str = "Welcome to java Programming";
		byte b[] = str.getBytes();
		fos.write(b);
		fos.close();
		
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void readOperation() 
	{
		
		try
		{
		fis = new FileInputStream(file);
		int data = fis.read();
		while(data!=-1)
		{
			System.out.println((char)data);
			data = fis.read();
		}
		
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		filestreamdemo obj =  new filestreamdemo();
		obj.writeOperation();
		obj.readOperation();
	}
}
