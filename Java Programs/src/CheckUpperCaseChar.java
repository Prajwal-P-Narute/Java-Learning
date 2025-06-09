import java.util.Scanner;
public class CheckUpperCaseChar {
	public static void main(String[] a) {
	Scanner sc = new Scanner(System.in);
	char alpha = sc.next().charAt(0);
	if(alpha>='A' && alpha<='Z') {
		System.out.println(alpha+ " is a Upper case charecter");
		
	}
	else if(alpha>='a' && alpha<='z') {
		System.out.println(alpha+ " is a Lower case charecter");
		
	}else{
		System.out.println(alpha+" is not a alphabet");
	}
	

}
}