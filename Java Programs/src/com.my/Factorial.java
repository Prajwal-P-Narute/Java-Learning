package com.my;

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();
	System.out.println(factorial(num));

}
	public static int factorial(int num) {
		int fact = 1;
		
		for(int i=2;i<=num;i++) {
			fact = fact*i;
			
		}
		return fact;
	}

}