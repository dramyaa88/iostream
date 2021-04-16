package demo.files;

import java.io.*;

public class RandomAccessFileDdemo {
	
	static void invoke() throws IOException
	{
		try
		{
			RandomAccessFile file = new RandomAccessFile("MyFile.txt", "rws");
			file.write(100); // 4 bytes 0-3
			file.writeFloat(456.89f); // next 4 bytes 4-7 
			file.writeChars("Java Platform");
			
			
			
			file.close();
			
			file = new RandomAccessFile("MyFile.txt","r");
			file.seek(4);
			Float data = file.readFloat();
			System.out.println(data);
			file.seek(8);
			
			byte[] obj = new byte[10];
			int d = file.read(obj);
			System.out.println("Length "+d);
			for(int i=0;i<d;i++)
			{
				System.out.println((char)obj[i]);
			}
			
			
			while(d!=0)
			{
				System.out.println(d);
				file.read();
				d++;
			}
			
			System.out.println(file.readLine());
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		invoke();
	}
}
