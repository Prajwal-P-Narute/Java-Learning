// import java.lang.String;
import java.util.*;
import java.util.Collections;
 class Demo {
	public static void main(String [] args) {
     int num = 488293;
     int copy1 = num;
     int copy2 = num;
     int count = 0;
     
     while(num != 0) {
    	 count++;
    	 num/=10;
     }
     
     
     if(count % 2 != 0) {
    	 
    	int rev = 0;
    	 
    	 while(copy1 != 0) {
    		 rev = rev*10 + copy1%10;
    		 copy1 /= 10;
    	 }
    	 System.out.println(rev);
     }
     
     else {
    	 int halfDigits = count / 2;
    	 
    	 int divisor = createDivisor(halfDigits);
    	 
    	 int firstHalf = copy2 / divisor;
    	 int secondHalf = copy2 % divisor;
    	 
    	 int finalNumber = secondHalf*divisor + firstHalf;
    	 System.out.println(finalNumber);
     }
			
    }
	
	public static int createDivisor(int halfDigits) {
		int res = 1;
		for(int i = 1;i <=halfDigits; i++) {
			res *= 10;
		}
		return res;
	}

}