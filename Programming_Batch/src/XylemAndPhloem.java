
// The sum of first and last digit will be equals
//to the summation of remaining digits
public class XylemAndPhloem {
   public static void main(String[] args) {
//	 int num  = 1234;
//	 int copy = num;
//	 int copy1 = num;
//	 int count = 0;
//	 
//	 
//	 while(num != 0) {
//		 count++;
//		 num/=10;
//	 }
//	 
//	 
//	 int lastDigSum = 0;
//	 int remDigSum = 0;
//	 int  i =count;
//	 
//	 
//	 
//		 while(copy != 0) {
//			 int deg = copy%10;
//			 
//			 if(i == count || i == 1) {
//				 
//			 lastDigSum = lastDigSum + deg;
//			
//		 }
//			 else {
//				 remDigSum = remDigSum + deg;
//			 }
//			 i--;
//			 copy/=10;
//		 
//		 }
//		 
//		 
//		 
//		 
//		 
//		 if(lastDigSum == remDigSum)
//			 System.out.println(copy1 +" Xylem Number");
//		 else
//			 System.out.println(copy1 +" Phloem Number");
	   
	   
	   int num = 1238;
	   int num1 = num;
	   int OutDigSum = num%10;
	   int remDigSum = 0;
	   num = num/10;
	   
	   while(num>9) {
		   int rem = num%10;
		   remDigSum = remDigSum + rem;
		   num = num/10;
	   }
	   OutDigSum = OutDigSum + num;
	   
	   if(OutDigSum == remDigSum)
		   System.out.println(num1 + " is xylem");
	   else
		   System.out.println(num1 + " is phloem");
}
}
