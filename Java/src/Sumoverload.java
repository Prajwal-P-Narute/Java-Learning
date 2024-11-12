
public class Sumoverload {
        public static void main(String[] args) {
        	
        	sumOf(2,3);
        	sumOf(5,6,7);
        	sumOf(7,34,2,90);
        }
        
        public static void sumOf(int a, int b) {
        	System.out.println("Sum of two numbers is " +(a+b));
        }
        public static void sumOf(int a, int b, int c) {
        	System.out.println("Sum of three numbers is " +(a+b+c));
        }
        public static void sumOf(int a, int b, int c, int d) {
        	System.out.println("Sum of four numbers is " +(a+b+c+d));
        }
}
