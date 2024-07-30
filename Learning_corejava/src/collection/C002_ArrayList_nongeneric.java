package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C002_ArrayList_nongeneric {
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		ArrayList al = new ArrayList();
		al.add("Php");
		al.add("Java");
		al.add(20);
		al.add(10.236);
		al.add('A');
		al.addAll(a);
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}
