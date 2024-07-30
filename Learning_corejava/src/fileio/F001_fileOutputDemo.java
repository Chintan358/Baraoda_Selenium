package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_fileOutputDemo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("enter email : ");
		String email = sc.next();
		
		
		FileOutputStream fos = null;
		try
		{
			 fos = new FileOutputStream("C:\\Chintan_work\\Files\\"+name+".txt");
			
			//String str = "This is my first io program...";

			byte b[] = email.getBytes();
			
			fos.write(b);
			System.out.println("done...");
			
			
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
