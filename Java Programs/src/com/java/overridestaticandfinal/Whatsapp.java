package com.java.overridestaticandfinal;


public class Whatsapp implements Messenger {

	@Override
	public void send() {
		
	System.out.println("implementation whatsapp class method");	
	}
	
    public void receive() {
    	System.out.println("receive default method of whatsapp class");
    }
}
