package com.jspiders.demobankingapp.data;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.demobankingapp.entity.User;

public class UserDataImplementation implements UserData{
	
	private List<User> users = new ArrayList<User>();

	@Override
	public void addUser(User user) {
		users.add(user);
		System.out.println("Account is created");
		
	}

	@Override
	public void deleteUser(long mobileNumber, int securityPin) {
		boolean flag = false;
		for ( User user: users) {
			if(user.getSecurityPin()== securityPin && user.getMobileNumber()== mobileNumber) {
				flag = true;
				users.remove(user);
				break;
			}
		}
		if(flag) {
			System.out.println("account is deleted");
		}else {
			System.out.println("something went wrong");
		}
		
	}

	@Override
	public void updateUser(int securityPin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findeUser(int securityPin) {
		User user = null;
		for(User u : users) {
			if(u.getSecurityPin() == securityPin) {
				user = u;
				break;
			}
		}
		
		if(user != null) {
			System.out.println(user);
		}
		else {
			System.out.println("Envalid security Pin");
		}
		
	}

	

}
