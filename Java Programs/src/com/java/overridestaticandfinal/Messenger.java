package com.java.overridestaticandfinal;

public interface Messenger {
      void send();
   
      default void receive() {
    	  System.out.println("receive method of interface");
      }
}
