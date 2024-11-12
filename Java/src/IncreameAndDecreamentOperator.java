
public class IncreameAndDecreamentOperator {
	public static void main(String[] ar) {
		int a =  10;
		
//		// Post Increment Operator
//		System.out.println(a++); // it first print value as it is
//   	    System.out.println(a); // after above increment the incremented value is printed
//   	    
    	    int b=20;
//   	 System.out.println(++b); // it first increment value by one and printed immediately
//   	 System.out.println(b);
		
		System.out.println(a + b - (++a) + (--b) - (b--) + (++a));
		System.out.println(a);
		System.out.println(b);
   	    
   	    
	}

}
