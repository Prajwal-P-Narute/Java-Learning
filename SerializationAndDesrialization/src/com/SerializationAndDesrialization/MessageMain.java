package com.SerializationAndDesrialization;

import java.io.IOException;

class MessageMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Message message = new Message();
		
		message.send("Hi, How are you?");
		
		
		System.out.println(message.receive());

	}

}
