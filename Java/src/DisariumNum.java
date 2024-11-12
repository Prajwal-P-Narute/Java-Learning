
class DisariumNum {

	public static void main(String[] args) {
		int num = 175;
		int count = 0;
		int copy = num;
		int copy2 = num;
		int sum = 0;
		
		
		// for finding the number of digits in given number
		while(num != 0) {
			num /=10;
			count++;
		}
		
	
		while(copy != 0) {
			int d = copy%10;
			int res = 1;
			
			for(int i=1;i<=count;i++) {
				res *=d;
			}
			sum +=res;
			copy/=10;
			count--;
		}
		if(copy2 == sum) {
			System.out.println(copy2 + " is a disarium number");
		}
		else {
			System.out.println(copy2 + " is not a disarium number");
		}

	}

}
