
public class PrimeNumInArray {
      public static void main(String[] args) {
    	  
    	  int [] a = {3,4,5,21,34,71,78,89,1,29,45,23,92,0, 2};
    	  int sum = 0;
    	  for(int i=0;i<a.length;i++) {
    		  
    	  if(isPrime(a[i])) {
    		  System.out.println(a[i]);
    		  sum = sum + a[i];
    	  }
    	  
    	  }
    	  System.out.println(sum);
      }
      
      public static boolean isPrime(int a) {
    	  int count = 2;
    	  
    	  if( a ==1 || a ==0) { // this is in case of 0 and 1 because they are not a prime numbers
    		  return false;
    	  }else
    	  {
    	  
    	  for(int i=2;i<=a/2;i++) {
    		  if(a%i==0) {
    			  count++;
    		  }
    		  
    	  }
    	  if(count==2) {
    		  return true;
    	  
    	    }
    	  else {
    		  return false;
    	  }
    	  
    	  }
      }
}
