package com.my;

// printing first 10 prime numbers
class PrimeNumberCount {
	public static void main(String[] args) {
		int num = 3;
		int count = 1;
		System.out.println(2);
		while(count<10) {
			int count2  =1;
			for(int i=2;i<=num/2;i++) {
				
				
				if(num % i == 0) {
					count2++;
					break;
				
				}
				
				
			}
			if(count2 == 1) {
				System.out.println(num);
				count++;
			}
			num++;
		}
		
	}
}
