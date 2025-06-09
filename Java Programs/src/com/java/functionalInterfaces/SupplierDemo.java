package com.java.functionalInterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Supplier interface represents supplier of results and does not take any input.
        // it is often used to generate or supply values without requiring input arguments.

        // it is very useful when need time and date functionality in your project
        // it is very useful when you need to generate random numbers in your project.

        Supplier<LocalDateTime> dateTime = () -> LocalDateTime.now();
      System.out.println(dateTime.get());

        printCurrentDateAndTime(dateTime);

    }
    public static void printCurrentDateAndTime(Supplier<LocalDateTime> dateAndTime){
        System.out.println(dateAndTime.get());
    }
}
