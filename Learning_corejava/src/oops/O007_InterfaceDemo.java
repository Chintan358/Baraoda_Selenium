package oops;

interface I1
{
	public static final int k = 10;
	public void sample();
}

interface I2 extends I1
{
	public void display();
}

class Demo
{
	
}
class Interimpl extends Demo implements I1,I2
{

	@Override
	public void sample() {
		// TODO Auto-generated method stub
		//k = 500;
		System.out.println(k);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}


public class O007_InterfaceDemo {
	public static void main(String[] args) {
		
		
		
	}
}
