
public class SmallestAmongFourNum {
	
		 int a = 10;
	    	  
	    		    public static void main(String[] args) {
	    		        int a = 10;
	    		        int b = 2;;;; // Equivalent to writing int b = 2; ; ; ;The compiler processes each semicolon as a separate empty statement, 
	    		                      // which is perfectly legal, even though it serves no purpose.
	    		        int c = 5;
	    		        int d = 33;

	    		       
	    		      
	    		    

	    		   
	    		        int smallest = a; // Assume 'a' is the smallest initially

	    		        // Compare with 'b'
	    		        if (b < smallest) {
	    		            smallest = b;
	    		        }

	    		        // Compare with 'c'
	    		        if (c < smallest) {
	    		            smallest = c;
	    		        }

	    		        // Compare with 'd'
	    		        if (d < smallest) {
	    		            smallest = d;
	    		        }

	    		        System.out.println(smallest);
	    		    }
	    		

	       }



