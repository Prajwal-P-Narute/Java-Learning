
import java.util.*;

public class elseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a<5000) {
			System.out.println("Sedentary");
		}
		else if(a>=5000 && a<7500) {
			System.out.println("Low Active");
		}
		else if(a>=10000 && a<12500) {
			System.out.println("Active");
		}
		else {
			System.out.println("Highly Active");
		}
		
	}

}
