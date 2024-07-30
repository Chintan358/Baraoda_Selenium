package fileio;

import java.io.File;
import java.io.IOException;

public class F004_file {
	public static void main(String[] args) throws IOException {
		
		
		
		File file = new File("C:\\Chintan_work\\Files\\home.txt");
		
//		file.mkdir();
//		System.out.println("folder created");
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		
//		if(file.exists())
//		{
//			System.out.println("File exists !!!");
//			file.delete();
//		}
//		else
//		{
//			System.out.println("File not Exists...");
//			file.createNewFile();
//		}
		
	}
}
