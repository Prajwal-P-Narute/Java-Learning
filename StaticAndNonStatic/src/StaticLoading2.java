
public class StaticLoading2 {
     public static int x;
     public static int y;
     
     static {
    	 System.out.println("control gets inside in static block");
    	 x=20;
    	 y=30;
    	 System.out.println(sum(x,y));
     }
     
     public static int sum(int x, int y) {
    	 System.out.println("sum(int, int) is called by static block for execution");
    	 return x+y;
     }
     
     public static void main(String[] args) {
    	 System.out.println("The main method is called by JVM for execution");
     }
}
