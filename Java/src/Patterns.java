
import java.util.Scanner;

public class Patterns {
	public static void main(String [] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
//		
//		int r1  = sc.nextInt();
//		
//		for(int i=0;i<rows;i++) {
//			
//			for(int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		
		// WATER IMAGE OF ABOVE PATTERN
		// this all code is solved by me without referring the any other sources
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
//		int r4 = sc.nextInt();
//		for(int i=0;i<r4;i++) {
//			
//			for(int j = r4-i;j>0;j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
//            *
//          * * 
//        * * *
//      * * * *   
//    * * * * *   
//		 int r2 = sc.nextInt();
//		 for(int i=0;i<r2;i++) {
//			 
//			 for(int j= 2*(r2-i); j>=0;j--) {
//				 System.out.print(" ");
//				 
//			 }
//			 for(int k=0;k<=i;k++) {
//				 System.out.print("* ");
//			 }
//			 
//			 System.out.println();
//		 }
		
		
	    
//		 WATER IMAGE OF ABOVE PATTERN
		// this all code is solved by me without referred any sources
//    * * * * * 
//      * * * *
//        * * *
//          * *
//		      *
//		
//		int r5 = sc.nextInt();
//		
//		for(int i=0;i<r5;i++) {
//			
//			for(int j = i*2;j>0;j--) {  // this is condition is my own and created by me
//				System.out.print(" ");
//			}
//			
//			for(int k = r5-i;k>0;k--) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
		
		
		
		
		
//		* 
//	   * *
//	  * * *
//	 * * * *
//	* * * * * 
		
		
		int r3 = sc.nextInt();
		
		for(int i=0;i<r3;i++) {
			
			for(int j = (r3 - i); j>0;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
//		
		
		    
		    
		    
		    
		    
		    
//		        *	      
//			  * *     
//			* * *
//		  * * * *
//	    * * * * * 
//	      * * * *
//	        * * *
//	          * *
//			    *
		}

}
