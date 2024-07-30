package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class C006_HashmapDemo {
	public static void main(String[] args) {
		
		
		
		HashMap<String, Integer> result  = new HashMap<String, Integer>();
		result.put("Java", 10);
		result.put("android", 50);
		result.put("Node",60);
		result.put("SQL", 20);
		result.put("Selenium",10);
		result.put("Java", 60);
		
		//System.out.println(result);
		
		Set s = result.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
