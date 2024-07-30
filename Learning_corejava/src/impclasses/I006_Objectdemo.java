package impclasses;

class A
{
//	public void display()
//	{
//		
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello";
	}
}

class B extends A
{
	
}

public class I006_Objectdemo {
	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a);
		
	}
}
