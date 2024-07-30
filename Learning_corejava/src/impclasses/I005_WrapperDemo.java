package impclasses;

public class I005_WrapperDemo {
	public static void main(String[] args) {
		
		
		int a = 10;
		
		//boxing
		Integer b = new Integer(a);
		//auto - boxing
	    Integer c = a;
		
	    Integer k = 50;
	    //unboxing
	    int l = k.intValue();
	    //auto unboxing
	    int m = k;
	    
	    
	    
	    int i = 56595;
	    Integer j = i;
	    int length =  j.toString().length();
	    System.out.println(length);
	    
		
	}
}
