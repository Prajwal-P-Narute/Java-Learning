package com.java.exception.Throws;

public class MainClas {

    public static void main(String[] args) throws ArithmeticException {

        int a = 20;
        int b = 0;

        divide(a, b);
//        try {
//            divide(a, b);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
        System.out.println("after handling exception");


    }

    public static void divide(int a, int b)throws ArithmeticException {


        System.out.println(a/b);
    }

    

}
