
import java.util.Scanner;


public class PrimeNumber {
       
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int flag = 0;
//		if(num==0 || num==1) {
//			System.out.println(num + " is not a prime number");
//		}
//		else {
//			for(int i=2;i<=num/2;i++) {
//				if(num%i==0) {
//					System.out.println(num + " is not a prime number");
//					flag = 1;
//					break;
//				}
//			}
//			
//			if(flag == 0) {
//				System.out.println(num + " is a prime number");
//			}
//			
//		}
		
		
		
		
		// ANOTHER LOGIC
		int count = 2;
		
		for(int i=3;i<=num/2;i++) {
			
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.print(num + " is not a prime number");
		}
		
		
	}
}
