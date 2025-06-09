package com.java.lambdaStream;

interface Addition {

    int add(int a, int b);

    default void printAddition(){
        System.out.println("default method of functional Interface");
    }

    static void staticMethodAddition(){
        System.out.println("static method of functional interface");
    }
}
