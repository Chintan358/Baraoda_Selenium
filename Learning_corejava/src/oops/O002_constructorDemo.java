package oops;

class Student
{
	int id;
	String name;
	
//	Student()
//	{
//		System.out.println("constructo calling..");
//	}
//	
//	Student(int a)
//	{
//		System.out.println(a);
//	}
	
	Student(int id,String name)
	{	
		this.id = id;
		this.name = name;
	}
	
	
	public void disp()
	{
		System.out.println(id+" "+name);
	}
}

public class O002_constructorDemo {
	public static void main(String[] args) {
		
		
		
		Student st = new Student(10,"Krunal");
		st.disp();
		
		Student st1 = new Student(20,"Drupa");
		st1.disp();
		
		
		
	}
}
