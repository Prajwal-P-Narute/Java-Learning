package com.jspiders.demobankingapp;
import java.util.Scanner;

import com.jspiders.demobankingapp.business.UserBusinessImplementation;


public class App {
  public static void main(String[] args) {
	  
	  UserBusinessImplementation userBusiness = new UserBusinessImplementation();
	  Scanner sc = new Scanner(System.in);
	  
	  boolean run = true;
	
	
	
	while (run) {
		System.out.println("Enter 1 to create an account");
		System.out.println("Enter 2 to login");
		System.out.println("Enter 3 to exit");
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1:
			userBusiness.createAccount();
			break;
		case 2:
			break;
		case 3: 
			run =false;
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
	
}
  
}
