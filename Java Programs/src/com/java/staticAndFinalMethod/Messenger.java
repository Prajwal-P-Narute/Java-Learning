package com.java.staticAndFinalMethod;

public interface Messenger {
      void send();
      
     default void receive() {
    	  System.out.println("default receive method of interface");
      }
     
     static void demo() {
    	System.out.println("static method of interface");
     }
}
