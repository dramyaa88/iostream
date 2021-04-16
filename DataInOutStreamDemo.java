package demo.bytestream;

import java.io.*;

public class DataInOutStreamDemo {
	
	
	public void DataOutputOpearation() throws IOException
	{
		FileOutputStream file = new FileOutputStream("D:\\File\\testout.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeInt(65);
		data.flush();
		data.close();
		System.out.println("Success.......");
	}
	
	public void DataInputOperation() throws IOException
	{
		InputStream files = new FileInputStream("D:\\File\\MyFile.txt");
		DataInputStream datas = new DataInputStream(files);
		datas.r
		int count = files.available();
		byte[] arry = new byte[count];
		datas.read(arry);
		for(byte bt:arry)
		{
			char k =(char)bt;
			System.out.print(k+"-");
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		DataInOutStreamDemo obj = new DataInOutStreamDemo();
		obj.DataOutputOpearation();
		obj.DataInputOperation();
	}

}
