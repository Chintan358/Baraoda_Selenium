package oops;

class Sample
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("m1 : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int r = a+b+c;
		System.out.println("m2 : "+r);
	}
	
	public void add(int a, double b)
	{
		double r  = a+b;
		System.out.println("m3 : "+r);
	}
	
}

public class O004_Methodoverloading {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.add(10, 20);
		s.add(10, 20 , 30);
		s.add(100, 300.23);
	}
}