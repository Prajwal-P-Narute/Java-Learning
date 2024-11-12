import java.util.Scanner;
public class CheckVowel {
	public static void main (String[] ar) {
		
		Scanner sc = new Scanner(System.in);
		char alpha = sc.next().charAt(0);
		
		if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u') {
			System.out.println(alpha+ " is a vowel");
			
		}
		else {
			System.out.println(alpha+ " is no a vowel");
		}
	}

}
