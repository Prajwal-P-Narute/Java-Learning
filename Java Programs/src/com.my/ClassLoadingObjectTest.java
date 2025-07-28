package com.my;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassLoadingObjectTest {

    public static void main(String[] args) {
        Student s = new Student();
              Class c =  s.getClass();
        System.out.println(c.getName());

                Method[]m =  c.getDeclaredMethods();
                for(Method i : m){
                    System.out.println(i);
                }

              Field[]f =  c.getDeclaredFields();
                for(Field i:f){
                    System.out.println(i);
                }

        System.out.println(String.class.getClassLoader());
        System.out.println(Student.class.getClassLoader());
        System.out.println(ClassLoadingObjectTest.class.getClassLoader());
        System.out.println(Arrays.class.getClassLoader());
        System.out.println(Exception.class.getClassLoader());

    }

}
