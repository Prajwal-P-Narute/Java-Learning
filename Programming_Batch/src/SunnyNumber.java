
public class SunnyNumber {

	public static void main(String[] args) {
		
		int num = 195;
		int num1 = num +1;
		
		int res = 0;
		
		int sunny = 0;
		
		for(int i=1;res<=num;i++) {
			res = i*i;
			if(res == num1) {
				break;
			}
		}
		if(res == num1) {
			System.out.println(num+" is a Sunny Number");
		}
		else
			System.out.println(num+ " is not a Sunny Number");

	}

}
