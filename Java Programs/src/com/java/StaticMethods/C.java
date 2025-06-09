package com.java.StaticMethods;

public class C implements A, B {


//     this is static method of Class C only
    // it is not overrided from Interface A and Interface B
    // because static method cant be override in its implemented class
    // because method are fixed in nature we cant change its implementation
    static void demo(){
        System.out.println("static method of Class C ");
    }


    public static void main(String[] args) {

        A.demo(); // static method of interface A. it is calling by using interface name as reference
        B.demo();//  static method of interface B. it is calling by using interfacename as reference.

        C.demo();
        demo();


    }
}
