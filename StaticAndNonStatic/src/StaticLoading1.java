
// all the static and not static multi-line initializers gets executed first
// then main method is called by JVM for execution



public class StaticLoading1 {
      public static int a = 10;
      public static int b = 20;
      public static String x; // intialize with default value null
      public static String y;
      
      static {
    	  System.out.println("Control entered in static block1");
//    	  x=30;
    	  y="Hi";
      }
      
      public static void test2() {
    	  System.out.println("test2() is called by test1() for execution" );
    	  System.out.println(a);
    	  System.out.println(b);
    	  System.out.println(x);
    	  System.out.println(y);
    	  
      }
      
      public static void main(String[] args) {
    	  System.out.println("the main method is called by JVM for execution");
    	  test1();
    	  
      }
      
      static {
    	  System.out.println("Control entered static block2");
    	  a = 50; // Reinitialize the value of a with 50
      }
      
      public static void test1() {
    	  System.out.println("test1() is called by main method for execution");
    	  test2();
      }
}
