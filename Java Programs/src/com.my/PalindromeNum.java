package com.my;

import java.util.Scanner;
public class PalindromeNum {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		int temp = num;
		
		while(temp>0) {	
			int rem = temp%10;
			sum = sum*10 + rem;
			temp = temp/10;
		}
		if(sum == num) {
			System.out.println(num+ " is a palindrome number");
		}
		else {
			System.out.println(num + " is not a palindrome number");
		}
	}

}
	