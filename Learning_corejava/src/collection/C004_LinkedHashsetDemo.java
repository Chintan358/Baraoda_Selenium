package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class C004_LinkedHashsetDemo {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
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
