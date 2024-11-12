package com.jspiders.demobankingapp.data;

import com.jspiders.demobankingapp.entity.User;

public interface UserData {
	
   void addUser (User user);
   
   void deleteUser(long mobileNumber, int SecurityPin);
   
   void updateUser(int securityPin);
   
   void findeUser(int securityPin);
}
