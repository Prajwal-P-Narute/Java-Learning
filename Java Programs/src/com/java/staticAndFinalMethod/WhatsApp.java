package com.java.staticAndFinalMethod;

public class WhatsApp implements Messenger {

	@Override
	public void send() {
		System.out.println("send method");

	}

//	public void receive() {
//		System.out.println("receive method of implementing class");
//	}
	
	
	

//	This is a new static method in the WhatsApp class. It does not override the static method demo() in the Messenger
//    interface because static methods in interfaces cannot be overridden.
// method shadowing is happened here because parent class static demo method is shadowed by
// child class static demo method
	static void demo() {
			System.out.println("static method of implementing class");
		}

}
