package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_fileWriterDemo {
	public static void main(String[] args) {
		
		
		try {
			FileWriter fw = new FileWriter("C:\\Chintan_work\\Files\\sample.txt");
			
			String str = "Hello java, Hello tops";
			
			fw.write(str);
			
			fw.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
