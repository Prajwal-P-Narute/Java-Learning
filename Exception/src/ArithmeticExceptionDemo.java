
 class ArithmeticExceptionDemo {
	// ArithmeticException
	
	     public static void main(String[] args) {
	     	System.out.println("start of a program");
	     	
	     	int a = 10;
	     	int b = 0;
	     	
	     	try {
	     		
	     		System.out.println(a/b);
	     		
	     	}
	     	
	     	catch(ArithmeticException e) {
	     		System.out.println("I cannot divide any number by zero");
	     	}
	     	
	     	
	     	
	     	System.out.println("end of a program");
	     }
	 }


