
public class SumOfChar {
	public static void main(String[] args) {
		System.out.println(charSum('d', 'b'));
	}
	
	public static int charSum(char a, char b) {
		
		// Here Widening is Happened because we converted char to int
		int sum = a + b;
		return sum;
	}

}
