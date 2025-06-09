package com.java.DefaultMethods;

public interface InterfaceA {
    void method1();
    void method2();


    // use of default method is when we dont want to add your logic to implemented class
    // simply we call it in implemented class and use it.
    default void default1(){
        System.out.println("default method of interface A");
    }

    default void default2(){
        System.out.println("default method of interface A");
    }
}
