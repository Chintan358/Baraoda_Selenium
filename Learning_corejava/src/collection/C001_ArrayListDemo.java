package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_ArrayListDemo {
	public static void main(String[] args) {
		
		
		//default size : 10
		//new size = (oldsize * 3/2 )+ 1
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("php");
		al.add("android");
		al.add("Node");
		al.add("Java");
		al.add(null);
		
		//al.add(1,"React");
		//al.set(1, "React");
		//al.remove(1);
		
		//System.out.println(al.size());
		
		//System.out.println(al.get(2));
		
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
		
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
