
//  The sum of factors of a given number except the given number itself should be equals
// to the given number is known as perfect number
class PerfectNumber {

	public static void main(String[] args) {
		int num = 6;
		int sum = 0;
		for(int i = 1; i<=num/2; i++) {
			
			if(num % i == 0) {
				sum += i;
			}
		}
      
		System.out.println(sum == num);
	}

}
