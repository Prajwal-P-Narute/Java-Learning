package com.java.staticAndFinalMethod;

public class MessengerMain {
	public static void main(String[] args) {
		WhatsApp whatsApp = new WhatsApp();

		whatsApp.send();
		whatsApp.receive();

//        Calls the static method defined in the Messenger interface

		Messenger.demo();

//		 Calls the static method defined in the WhatsApp class.
		WhatsApp.demo();
	}
	
	
	

//	Static methods in a superclass or interface are not inherited by subclasses or implementing classes. 
//	They must be called using the class/interface name.
}
