
public class SumOfFirst100PrimeNumbers {
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=num/2; i++) {
			if(num % i == 0) {
			   return false;
			}
		}
		return true;
	}
        public static void main(String[] args) {
        	
        	int count = 1;
        	int sum = 0;
        	int num = 2;
        	
        	while(count<=100) {
        		if (isPrime(num)) {
        			sum = sum + num;
        			System.out.println(num);
        			count ++;
        		}
        		num++;
        	}
        	
        	System.out.println("The sum of first 100 prime numbers is " + sum);
        }
}
