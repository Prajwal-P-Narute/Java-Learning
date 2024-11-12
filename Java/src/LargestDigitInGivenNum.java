import java.util.Scanner;
public class LargestDigitInGivenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int largest_dig = num%10;
		num /=10;
		
		while(num !=0 ) {
			int dig = num%10;
			
			if(dig>largest_dig) {
				largest_dig = dig;
			}
			num/=10;
			
		}
		System.out.println(largest_dig);
		
	}

}
