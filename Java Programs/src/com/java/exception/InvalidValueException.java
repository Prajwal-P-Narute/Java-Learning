package com.java.exception;

public class InvalidValueException extends Exception{

    public InvalidValueException(String str){
//        System.out.println(str);
        super(str);
    }
}
