package com.jspiders.demobankingapp.entity;

import com.jspiders.demobankingapp.enums.Gender;



public class AadharCard {
  private long aadharNumber;
  private String address;
  private String dob;
  private Gender gender;
public AadharCard(long aadharNumber, String address, String dob, Gender gender) {
	super();
	this.aadharNumber = aadharNumber;
	this.address = address;
	this.dob = dob;
	this.gender = gender;
}
  
  
}
