package com.java.lambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Lambda expression with one parameter only
        Greeting greeting = (name)-> System.out.println("Hello "+name);
        greeting.greet("Prajwal");


        // Lambda expression with multiple parameter and block of code or logic
        // we can also write parameter without datatype
        Addition addition = (a, b) ->{
            return a + b;
        };
        System.out.println("the addition of 2, 8 is "+ addition.add(2, 8));

        // we can write above code as parameter with datatype
        Addition addition2 = (int a, int b) ->{
            return a + b;
        };
        System.out.println(addition2.add(4, 6));

        // we can write above code without writing return statement also
        Addition addition3 = (a, b) -> a +b;
        System.out.println(addition3.add(5, 9));

        // execute default methods by using instance of interface
        addition3.printAddition();

        // executing static method of functional interface by interface name reference
        Addition.staticMethodAddition();


        // Lambda expression for collections

        List<String> stdName = Arrays.asList("Prajwal", "Omkar", "Yash", "Aniket", "Om");

        stdName.forEach(names ->{
            System.out.println("The names of the students are "+ names);
        });

        // lambda expression to calculate square of each number in collection list
        List<Integer> num = Arrays.asList(2, 8, 9, 3, 5, 23, 11, 45, 4, 98, 63 );

        List<Integer> squreNum = num.stream().map(number -> number*number).collect(Collectors.toList());
        System.out.println(squreNum);

        // lambda expression to filter list
        List<Integer> modifiedList = num.stream().filter(number -> number>10).collect(Collectors.toList());
        System.out.println(modifiedList);

        List<Integer> sortedList = num.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);


        // skip method accept nth number as argument and skip the first nth numbers
        // and return remaining numbers
        List<Integer> skippedList = num.stream().skip(5).collect(Collectors.toList());
        System.out.println(skippedList);


        // number of elements in the list
        long numberOfElementsList = num.stream().count();
        System.out.println(numberOfElementsList);



    }
}


