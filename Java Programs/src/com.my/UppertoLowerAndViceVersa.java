package com.my;

import java.util.Scanner;
public class UppertoLowerAndViceVersa {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		char alpha = sc.next().charAt(0);
		
		if(isalphabet(alpha)) {
			
			if(isUpper(alpha)) {
				System.out.println(toLower(alpha));
			}
			else if(isLower(alpha)) {
				System.out.println(toUpper(alpha));
			}
		}
		else {
			System.out.println(alpha+" is not a alphabet");
		}
		
	}
	
	public static boolean isalphabet(char alpha) {
		return (alpha >='a' && alpha <='z' || alpha>='A' && alpha<='Z');
	}
	
	public static boolean isUpper(char alpha) {
		return (alpha>='A' && alpha<='Z');
	}
	
	public static boolean isLower(char alpha) {
		return (alpha>='a' && alpha<='z');
	}
	public static char toLower(char alpha) {
		return   (char) (alpha + 32);
		
	}
	
	public static char toUpper(char alpha) {
		return (char)(alpha - 32);
	}

}
