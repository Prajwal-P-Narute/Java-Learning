package com.java.DefaultMethods;

public class MainClass {

    public static void main(String[] args) {
        Class1 obj1 = new Class1();

        obj1.method1();// abstract method
        obj1.method2();// abstract method

        // default method can access by using object reference of implemented class
        obj1.default1();// default method of interface
        obj1.default2();// overriden method of interface in implemented class



    }

}
