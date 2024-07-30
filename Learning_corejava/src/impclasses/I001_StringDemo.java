package impclasses;

public class I001_StringDemo {
	public static void main(String[] args) {
		
		// string is immutable - not changeable
		
		//string literal
		//String s = "Hello";
		
		//string object
		//String s1 = new String("Hello");
		
		//String str =  s.concat("java");
		
		//System.out.println(str);
		
		
		
		
		String str = "Java";
		String str1 = "Node";
		String str3 = "Java";
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str3));
		System.out.println(str == str3);
		
		System.out.println("***********************");
		
		String s1 = new String("Java");
		String s2 = new String("Node");
		String s3 = new String("Java");
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		
		
		
	}
}
