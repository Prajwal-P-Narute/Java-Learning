
public class MethodOverloading {
      public static void main(String[] args) {
//    	  float a = 10.5f;
//    	  float b = 20.5f;
    	  
    	  System.out.println(sum(10.5f, 35.6f));
    	  System.out.println(sum(10, 35, 80));
    	  
      }
      
      public static int sum(int a, int b) {
    	  System.out.println("sum(int, int) called");
    	  return a+b;
      }
      public static int sum(int a, int b, int c) {
    	  System.out.println("sum(int, int, int) called");
    	  return a+b+c;
      }
      
      public static float sum(float a, float b) {
    	  System.out.println("sum(float, float)called");
    	  return a+b;
      }
      
}
