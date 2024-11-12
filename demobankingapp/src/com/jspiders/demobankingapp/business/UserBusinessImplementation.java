package com.jspiders.demobankingapp.business;

import java.util.Scanner;

import com.jspiders.demobankingapp.entity.AadharCard;
import com.jspiders.demobankingapp.entity.User;
import com.jspiders.demobankingapp.enums.Gender;

import com.jspiders.demobankingapp.data.UserData;
import com.jspiders.demobankingapp.data.UserDataImplementation;


public class UserBusinessImplementation implements UserBusiness {
	
	private UserData userData = new UserDataImplementation();
	private Scanner scanner = new Scanner(System.in);

	@Override
	public void createAccount() {
	  System.out.println("Enter username : ");
	  String userName = scanner.next();
	  System.out.println("enter email address : ");
	  String email =  scanner.next();
	  System.out.println("Enter mobile number : ");
	  long mobileNumber = scanner.nextLong();
	  System.out.println("enter aadhar number : ");
	  long aadharNumber = scanner.nextLong();
	  scanner.nextLine();
	  System.out.println("Enter address : ");
	  String address = scanner.next();
	  System.out.println("Enter date of birth");
	  String dob = scanner.next();
	  Gender gender = null;
	  
	  boolean flag = true;
	  while (flag) {
		  System.out.println("Enter 1 for MALE");
		  System.out.println("Enter 2 for FEMALE");
		  System.out.println("Enter 3 for OTHERS");
		  int choice = scanner.nextInt();
		  switch (choice) {
			case 1:
				gender = Gender.MALE;
				flag = false;
				break;
			case 2:
				gender = gender.FEMALE;
				flag = false;
				break;
			case 3:
				gender = gender.OTHERS;
				flag = false;
				break;
			
			default:
				System.out.println("Invalid choice");
			}
		
	}
	  
	  
	  
	  System.out.println("Enter security pin : ");
	  int securityPin = scanner.nextInt();
	  
	  AadharCard aadharCard = new AadharCard(aadharNumber, address, dob, gender);
	  User user = new User(userName, email, mobileNumber, securityPin, aadharCard);
	  
	}

	@Override
	public void deleteAccount() {
		System.out.println("Enter mobile number");
	
		long mobileNumber = scanner.nextLong();
		System.out.println("Enter Security pin");
		int securityPin = scanner.nextInt();
		userData.deleteUser(mobileNumber, securityPin);
		
		
	}

	@Override
	public void updateAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logIn() {
		// TODO Auto-generated method stub
		
		System.out.println("enter security pin");
		int securityPin = scanner.nextInt();
		
		
	}
 
}
