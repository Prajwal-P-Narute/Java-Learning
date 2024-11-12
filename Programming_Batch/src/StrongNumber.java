
// The summation of each digit factorial of a number is equals to
// a given number is known as strong number
 class StrongNumber {
 public static void main(String[] args) {
	 int num = 145;
	 int copy = num;
	 int sum = 0;
	 
	 while(num != 0) {
		 int deg = num % 10;
		 
		 int fact = 1;
		 
		 for(int i = 1; i<=deg; i++){
			 
			 fact *= i;
		 }
		 sum +=fact;
		 num /= 10;
	 }
	 
	  if(copy == sum) {
		  System.out.println(copy + " is a strong number");
	  }
	  else
		  System.out.println(copy + " is a weak number");
 }
}