package oops;

class Calc
{
	public void msg()
	{
		System.out.println("displaying message....");
	}
	
	public int square(int a)
	{
		int sq = a*a;
		return sq;
	}
	
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println(r);
	}
	
	public void arrayadd(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum : "+sum);
	}
	
	public void test(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
}

public class O003_MethodManipulation
{
	public static void main(String[] args)
	{
		
		Calc c = new Calc();
//		c.msg();
//		c.square(10);
//		c.square(5);
//		c.add(10, 20);
		
//		int s = c.square(60);
//		System.out.println(s);
//		System.out.println(c.square(6));
		
		
//		int k[] = {10,20,30,40,50,60};
//		c.arrayadd(k);
//		int l[] = {1,2,3,4,5,6};
//		c.arrayadd(l);
		
		
		c.test(10,20,50,60);
		
	}
}
