package com.java.exception;

public class MainClass {

    public static void main(String[] args) throws Exception{
        String str = null;

//        if(str == null){
//           throw new Exception("Invalid value of string");
//        }else{
//            System.out.println(str);
//        }


        // here we have created user defined exception by using throw keyword
//        if(str == null){
//            throw new InvalidValueException("string cannot be null");
//        }else{
//            System.out.println("str");
//        }

        int a = 100;
        int b = 0;

        // here we have created user defined exception by using throw keyword
        // in division operation divider caanot be zero
        if( b == 0){
            throw new InvalidValueException("b cannot be zero for division operation");
//            throw new ArithmeticException("divisor cannot be zero in division operation");
        }else{
            System.out.println(a/b);
        }





    }


}
