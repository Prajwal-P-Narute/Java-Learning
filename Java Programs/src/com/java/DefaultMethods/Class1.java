package com.java.DefaultMethods;

public class Class1 implements InterfaceA{
    @Override
    public void method1() {
        System.out.println("abstract method1");
    }

    @Override
    public void method2() {
        System.out.println("abstract method2");
    }

//    You cannot override a default method with the default keyword in a class.
//    Default methods are only allowed in interfaces.
//    Instead, simply override it like a normal method.
    // this is overriden method of interface
    public void default2(){
        System.out.println("overriden method of Interface in class");
    }


}
