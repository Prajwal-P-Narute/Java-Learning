// sum of power of each digit based on the count will be equal to
// given number then it is known as Armstrong Number.
public class Armstrong {
 public static void main(String[] args) {
	   int num = 153;
	   int copy = num;
	   int copy1 = num;
	   
	   int count = 0;
	   
	   while(num != 0) {
		   count++;
		   num/=10;
	   }
	   
	   int sum = 0;
	   while(copy != 0) {
		   int dig = copy%10;
		   
		   int res = 1;
		   for(int i=1;i<=count;i++) {
			   res = res*dig;
		   }
		   sum = sum + res;
		   copy/=10;
	   }
	   
	   if(copy1 == sum)
	   System.out.println(copy1+" is a Armstrong Number");
	   else
		   System.out.println(copy1+ " is not a Armstrong Number");
}
}
