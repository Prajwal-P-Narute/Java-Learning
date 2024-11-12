 class NonStaticLoading1 {
     public int a =10;
     public int b;
//    public static int c;
     {
    	 System.out.println("Control entered inside non-Static block");
    	 b = 20;
     }
//     
//     static {
//    	 System.out.println("static block");
//    	 c = 60;
//    	 System.out.println(c);
//     }
     public NonStaticLoading1() {
    	 System.out.println("Constructor is invoked");
     }
     public void test() {
    	 System.out.println("test is called for execution by main");
    	 System.out.println(a);
    	 System.out.println(b);
     }
     
     public static void main(String[] args) {
    	 NonStaticLoading1 obj = new NonStaticLoading1(); // here immediately constructor gets invoke
    	 obj.test(); 
     }
 }
