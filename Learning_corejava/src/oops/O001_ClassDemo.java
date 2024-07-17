package oops;


class Pen
{
	//data member
	int price=20;
	static String color = "red";
	String company = "Cello";
	
	//function memebr
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		System.out.println("runing display");
	}
}

public class O001_ClassDemo 
{
	public static void main(String[] args) {
		
		Pen.color="Green";
		
		Pen p1 = new Pen();
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.price = 50;
		p2.toWrite();
		
		Pen p3 = new Pen();
		p3.toWrite();
		
		Pen.display();
	}
}
