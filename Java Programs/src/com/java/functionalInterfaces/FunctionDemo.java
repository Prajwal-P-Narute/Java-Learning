package com.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // req: find half value from given value
        Function<Integer, Double> doubleValue = i -> i/2.0;
        Double result = doubleValue.apply(10);
        System.out.println(result);

        // Given String Should be converted into upper case
        Function<String, String> str1 = s -> s.toUpperCase();

        String str2 = str1.apply("I am a Java Developer");
        System.out.println(str2);

        // andThen()
        // Is it null or not(NULL check)
        // if not null, To Upper Case:
        // it is NULL, Enter valid value this is text also converted to upper case

        // andThen() it first check null or not then result is passed to upper case

        Function<String, String > nullCheck = str -> str == null ? "Enter Valid value" : str;

        System.out.println(nullCheck.andThen(str1).apply("Java is a Programming Language"));
        System.out.println(nullCheck.andThen(str1).apply(null));

        //compose()
        // first the upper case value executed then result is passed to the nullCheck
        // it exactly opposite of andThen() method

        System.out.println(nullCheck.compose(str1).apply("My name is Prajwal"));
        System.out.println(nullCheck.compose(str1).apply(null));// here first he tries to convert result into upper case but
        // here null value we are passing so null value cannot covert into upper case
        // so thats why we get NUllPointerException




    }



}
