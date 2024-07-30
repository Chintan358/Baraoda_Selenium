package collection;

import java.util.HashSet;
import java.util.Iterator;

public class C003_HashsetDemo {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Android");
		set.add("Node");
		set.add("Php");
		set.add("Java");
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
