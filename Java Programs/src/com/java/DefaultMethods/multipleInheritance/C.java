package com.java.DefaultMethods.multipleInheritance;

public class C implements A, B {

    @Override
    // overriding same or common method of interface A and interface B in  implemented
    public void demo(){
        // if you want to access default method with same name and signature in two different interface
        // in implemented class then that can be done by using below steps.

        // Inteface.super.methodname()
        // if you want to call specific default method of interfaceA
        A.super.demo();

        // if you want to call specific default method of interfaceB
        B.super.demo();

    }
}
