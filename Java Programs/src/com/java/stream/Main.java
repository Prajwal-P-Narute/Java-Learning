package com.java.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {



    public static void main(String[] args) {
        List<Employee> employeeList = createEmployeeList();

        // this is imperative and procedural way to iterate over collection object
        // and get all employees with name as list
//        List<String> empName = new ArrayList<String>();
//        for (Employee emp : employeeList) {
//            empName.add(emp.getName());
//        }
//        System.out.println(empName);

        // get all employee with name with stream
        Stream<Employee> empStream = employeeList.stream();
        List<String> names = empStream.map(emp -> emp.getName()).toList();
        System.out.println(names);

       List<String> empList =  employeeList.stream()
                .filter(emp -> emp.getAge()>30) // Intermediate Operation
                .map(emp -> emp.getName()) // Intermediate Operation(it will not give you result it just perform operation and give stream object)
                .toList(); // Terminal Operation(it always give you the result)
        // and overall above is stream pipeline

        System.out.println(empList);


        // here we cannot modify original source of object directly
        // in order to operate on that object we have to convert it into stream object
//        List<String> empList =  employeeList
//                .filter(emp -> emp.getAge()>30) // Intermediate Operation
//                .map(emp -> emp.getName()) // Intermediate Operation
  //              .toList(); // Terminal Operation
        // and overall above is stream pipeline


        // get all distinct cities
        employeeList.stream()
                .map(emp -> emp.getCity())
                .distinct()
                .forEach(System.out::println);


        // get count of employees whose salary is >60k
        long countOFEmp = employeeList.stream()
                .filter(emp -> emp.getSalary()>60000)
                .count();
        System.out.println(countOFEmp);

        // get first 3 employee objects as a list
//        List<Employee> emp = employeeList.stream()
//                .limit(4)// intermediate operations
//                .toList();
//        System.out.println(emp);

        // skip first 3 employees and i want to collect others employees data
        List<Employee>skippedEmp = employeeList.stream()
                .skip(3)// exclude 3 employees object from the list of object inside stream
                // and processes other object and creates new stream object
                .toList();

        System.out.println(skippedEmp);

        // verify any employees whose age <30
        // anyMatch()
        boolean age = employeeList.stream()
                .anyMatch(emp -> emp.getAge()>50);
        System.out.println(age);

        // allMatch()
        // check if every employee are joined after 2009
        boolean res1 = employeeList.stream()
                .allMatch(emp -> emp.getYearOfJoining()>2009);
        System.out.println(res1);

        // noneMatch()
        // any one matching : false
        // no one matching : true
        boolean res2 = employeeList.stream()
                .noneMatch(emp -> emp.getYearOfJoining()<2009);
        System.out.println(res2);

        // findAny()
        // get one value from out of all values
        // it will return any object value out of all source object
       Employee res3 =  employeeList.stream()
               .filter(emp -> emp.getAge()>30)
                .findAny()
                .get(); // if the value is present returns value
        System.out.println(res3);

        // findFirst()
        // it always return first element of the stream
        Employee res4 = employeeList.stream()
                .findFirst()
                .get();
        System.out.println(res4);

        // sorted()
        // get all employees Id's in sorted order i.e ascending order
        List<Integer>empId = employeeList.stream()
                .map(emp -> emp.getId())
                .sorted()
                .toList();
        System.out.println(empId);

        // get all employees salary in ascending order i.e sorted order
        List<Double>empSal = employeeList.stream()
                .map(emp -> emp.getSalary())
                .sorted()
                .toList();
        System.out.println(empSal);

        // sorted : Comparator Arg
        // in above sorted method we extracted id by using map method and based on id we have sorted object
        // but here we will sort the overall object without extract id sort object itself

        List<Employee>empSorted = employeeList.stream()
                .sorted((emp1, emp2) ->{
                    return emp1.getId() - emp2.getId();
                })
                .toList();
        System.out.println(empSorted);

        // minimum salary employee details
        Employee employee1 = employeeList.stream()
                .min((emp1, emp2) ->{
                    return (int) (emp1.getSalary() - emp2.getSalary());
                })
                .get();
        System.out.println(employee1);

        // maximum salary employee details
        Employee employee2 = employeeList.stream()
                .max((emp1, emp2) ->{
                    return (int) (emp1.getSalary() - emp2.getSalary());
                })
                .get();
        System.out.println(employee2);

        //average()
       Double avgSalary =  employeeList.stream()
                .mapToDouble(emp -> emp.getSalary())
                .average().getAsDouble();
        System.out.println(avgSalary);

        // unique department names by using Collectors class
        Set<String> departments = employeeList.stream().map(Employee::getDepartment)
                .collect(Collectors.toSet());
        System.out.println(departments);

        // collect employee Names and their salaries as Map
        Map<String, Double> empAndSalary = employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(empAndSalary);

        // groupBy()
        // get avg salary of each department
        Map<String, Double>res5 = employeeList.stream().collect(Collectors.groupingBy(
                Employee::getGender, Collectors.averagingDouble(Employee::getSalary)
        ));

        System.out.println(res5);

        // count()
//        Get count of employees gender wise
        Map<String, Long>genderWiseEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(genderWiseEmployee);

        // summing all employees salary
        // summingDouble()
        Double sumOfSal = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sumOfSal);

        // summarizingDouble()
        DoubleSummaryStatistics summarizing =  employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(summarizing);

        //maxBY()
        // finding max age of employee
       Employee maxAge =  employeeList.stream()
               .collect(Collectors.maxBy((emp1, emp2) -> emp1.getAge() - emp2.getAge() )).get();
        System.out.println(maxAge);

        //joining
        // All department names with delimiter :::
        String allDepartments = employeeList.stream().map(Employee::getDepartment).collect(Collectors.joining("::"));
        System.out.println(allDepartments);






    }




    // Method to add employee data to ArrayList and return it
    public static List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(4, "John Doe", "New York", 28, "Male", "IT", 2018, 60000));
        employees.add(new Employee(2, "Jane Smith", "Los Angeles", 32, "Female", "HR", 2015, 75000));
        employees.add(new Employee(1, "Mike Johnson", "Chicago", 45, "Male", "Finance", 2010, 90000));
        employees.add(new Employee(5, "Emily Davis", "Los Angeles", 26, "Female", "Marketing", 2020, 55000));
        employees.add(new Employee(3, "Chris Brown", "San Francisco", 30, "Male", "IT", 2016, 72000));

        return employees;
    }
}
