package demo.files;

import java.io.*;
public class FileClass {
	
	static void fileOperations()
	{
		File file = new File("D:\\File\\MyFile.txt");
		System.out.println("File exists : "+file.exists());
		System.out.println("Is file present "+file.isFile());
		System.out.println("file length "+file.length());
		System.out.println("file absolute path "+file.getAbsolutePath());
		boolean dir = file.isDirectory();
		System.out.println("Directory "+dir);
		if(dir)
		{
			String files[] =file.list();
			System.out.println("contents in the Directory");
			for(String s:files)
			{
				System.out.println(s);
			}
		}
	}
	
	public static void main(String[] args) {
		fileOperations();
	}

}
