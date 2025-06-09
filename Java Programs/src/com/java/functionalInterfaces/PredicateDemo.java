package com.java.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        //Predicate is a functional interface that belongs to the java.util.function package
        // it represents a single-argument function that returns a boolean value(true or false)
        // it is commanly used for filtering and matching operations in streams and collections.
        //ex.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = num -> num%2 == 0;

        numbers.stream()
                .filter(isEven)// here we also pass direct arrow function without creating reference of Predicate in only stream api
                .forEach(System.out::println);


        Predicate<Integer>checkAge = age -> age>21;

        boolean res1 = checkAge.test(23);
        System.out.println(res1);

        Employee emp1 = new Employee();
        emp1.setId(100);
        emp1.setName("XYZ");
        emp1.setSalary(20000);

        // input as Employee
        Predicate<Employee> checkSal = e -> e.getSalary()>21000;
        if(checkSal.test(emp1)){
            System.out.println("Above 21000");
        }else{
            System.out.println("Below 210000");
        }

         //check salary > 21000 and employee is female
        emp1.setGender("female");

        Predicate<Employee> checkFemale = emp -> emp.getGender().equalsIgnoreCase("female");

        // and() method work like && operator in java
        // it first check sal is true or not means sal is greater than 21000 or not if yes
        // and then it checks gender is true or not means gender is female or not if yes
        // then value becomes true
        boolean result = checkSal.and(checkFemale).test(emp1);
        System.out.println(result);

        // sal>21000 or gender is male
          Predicate<Employee> checkMale = emp -> emp.getGender().equalsIgnoreCase("male");
          emp1.setGender("female");

          // or()
        boolean result2 = checkSal.or(checkMale).test(emp1);
        System.out.println(result2);

        // negate()
        boolean result3 = checkFemale.negate().test(emp1);
        System.out.println(result3);





    }
}
