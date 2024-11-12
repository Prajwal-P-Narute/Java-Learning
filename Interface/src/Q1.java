  interface Q1 extends P1 {
	  
	  public static final int b = 20;
	  public static void method3() {
		  System.out.println("Hello from method3()");
	  }
	  abstract public void method4();
    public static void main(String[] args) {
    	System.out.println(b);
    	method3();
    	System.out.println(a);
       // method1(); // CTE because static method from the interface P will not be inherited by interface Q
                   // in order to access static members of an interface we can make use of interface name as a reference
        P1.method1();
    }
}
