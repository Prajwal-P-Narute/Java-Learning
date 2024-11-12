
import java.util.*;

public class factorOfNumber {
      public static void main(String[] args) {
    	  Scanner sc  = new Scanner(System.in);
    	  
    	  long num = sc.nextInt();
    	  int count = 2;
    	  
    	  System.out.print(1+" ");
    	  
    	  for(int i=2;i<=num/2;i++) {
    		  
    		  if(num % i == 0) {
    			  System.out.print(i+" ");
    			  count++;
    		  }
    	  }
    	  System.out.println(num);
    	  System.out.print("the number of factors are "+count);
    	  
      }
}
