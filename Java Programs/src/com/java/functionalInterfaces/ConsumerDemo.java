package com.java.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer Interface represents an operation that takes single input argument
        // and return no result.
        // it typically useful for operations like printing, modifying, or adding without returning a value.
        // it contains method i.e accept()

        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        printUpperCase.accept("Prajwal Narute");

        List<String> names = List.of("abc", "xyz", "mno", "pqr");

        names.forEach(printUpperCase);// this convert each object of array into uppercase

        List<String> newNames = new ArrayList<String>();

        // this convert lower to upper and add in new list
        Consumer<String> addElements = str -> newNames.add(str.toUpperCase());

        names.forEach(addElements);
        System.out.println(newNames);
    }
}
