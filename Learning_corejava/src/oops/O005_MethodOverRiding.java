package oops;

/*final*/ class X
{
	/* final */ public void show()
	{
		System.out.println("Runing show method of class X");
	}
}

class Y extends X
{
	@Override
	public void show() {
		System.out.println("Running show of class Y");
		super.show();
	}
}

public class O005_MethodOverRiding {
	public static void main(String[] args) {
		
		
		Y y = new Y();
		y.show();
		
//		final int a = 10;
//		a = 50;
//		System.out.println(a);
		
	}
}
