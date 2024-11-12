
public class Oddnumbers {
   public static void main(String[] args) {
	   odd(100);
	   
	   
   }
   
   public static void odd(int num) {
	   for(int i=1;i<=num;i++) {
		   if(i%2!=0) {
			   System.out.println(i);
		   }
	   }
   }
}

