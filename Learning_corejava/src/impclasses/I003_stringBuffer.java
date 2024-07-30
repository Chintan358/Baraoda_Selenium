package impclasses;

public class I003_stringBuffer {
	public static void main(String[] args) {
		
		
		//syncronized
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for(int i=1;i<=100000;i++)
		{
			sb.append("selenium");
		}
		double endTime = System.currentTimeMillis();
		
		//async
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("java");
		for(int i=1;i<=100000;i++)
		{
			sb1.append("selenium");
		}
		double endTime1 = System.currentTimeMillis();
		
		
		System.out.println("time Takne by buffer : "+(endTime-startTime));
		System.out.println("time taken by builder : "+(endTime1-startTime1));
		
	}
}
