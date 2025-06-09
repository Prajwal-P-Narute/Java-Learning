package com.java.StreamPrograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJava {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 2, 22, 5, 10, 13, 7, 22, 34, 10, 6);

        System.out.println("1) Given the list of integers, find the first element of the list using stream function");
        nums.stream().findFirst().ifPresent(System.out::println);

        System.out.println("2) Given a list of integers, find the total number of elements present in the list using stream functions");
        System.out.println(nums.stream().count());

        System.out.println("3) Given a list of integers, find out all the even and odd numbers that exist in the list using stream function");
        List<Integer>evenNums = nums.stream().filter(num -> num % 2 ==0).collect(Collectors.toList());
        System.out.println(evenNums);

        List<Integer>oddNums = nums.stream().filter(num -> num % 2 !=0).collect(Collectors.toList());
        System.out.println(oddNums);

        System.out.println("4) Given a list of integers, find out all the numbers starting with 5 using stream function ");
        nums.stream().filter( num ->num.toString().startsWith("5")).forEach(System.out::println);

        System.out.println("5) Given a list of integers, find duplicate elements in a given integers list in java using stream functions");
        Set<Integer> temp = new HashSet<>();
        nums.stream().filter( num -> !temp.add(num)).forEach(System.out::println);

        System.out.println("6) Given a list of integers, find the maximum and minimum value element present in it using stream functions");
         Optional<Integer>max = nums.stream().max(Integer::compareTo);
         Optional<Integer>min = nums.stream().min(Integer::compareTo);
        System.out.println(max.orElse(null));
        System.out.println(min.orElse(null));


        System.out.println("7) Given a list of integers, sort all the values present in it using stream function");
//        nums.stream().sorted().forEach(System.out::println);
        List<Integer>sortedList = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("8) Given a list of integers, sort all the values present in it in descending order using stream function");
         List<Integer>reverseList = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseList);

        System.out.println("9) check array contain duplicate values or not");
        int arr[] = {1, 2, 4, 5, 2, 6, 7, 1 };
        if(Arrays.stream(arr).distinct().count() != arr.length){
            System.out.println("array contains duplicate values");
        }else{
            System.out.println("array does not contains duplicate values");
        }

        System.out.println("10) java 8 program to perform square on list elements and filter numbers greater than 50");
        List<Integer> list2 = nums.stream().map(num -> num*num).filter(num -> num>50).collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("11) write a java 8 program to sort an array and then convert the sorted array into stream");
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("12) how to use map to convert words into uppercase in java 8");
        List<String> words = Arrays.asList("Prajwal", "Pratik", "Pranit");
        words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);

        System.out.println("13) write a program to find the maximum element in an array");
        Arrays.stream(arr).max().ifPresent(System.out::println);

        System.out.println("14) write a java 8 program to concatenate two streams");
       Stream<Integer> s1 =  Stream.of(3, 2, 6, 7);
       Stream<Integer> s2 =  Stream.of(8, 1, 2, 0, 8);
//       Stream.concat(s1, s2).forEach(System.out::println);
        System.out.println(Stream.concat(s1, s2).collect(Collectors.toList()));

        System.out.println("15) write a program in stream to print 10 random");
        Random random = new Random();
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);

        System.out.println("write a java code to get the sum of the squares of all the odd numbers in the array");
        List<Integer> nums3 = List.of(2, 3, 4, 5, 6, 7, 8);
        int sum =  nums3.stream().filter(num -> num % 2 !=0).map( oddNum -> oddNum*oddNum).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("16) write a program to give sum of salary of employee");


        System.out.println("17) find the first unique character in a string using java stream.");

        System.out.println("18) given the array {10, 1, 20, 2, 100, 100, } write java code");

        System.out.println("16) print date and time using java 8 features");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("17) Then format it into dd-mm-yyyy format");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDateTime));

        System.out.println("18) How to check if list is empty in java 8 Optional if not null iterate through the list and print the object");
        List<String> list = null;
        Optional<List<String>> optionalList = Optional.ofNullable(list);
        optionalList.ifPresentOrElse(i -> i.stream().forEach(System.out::println), ()->System.out.println("the list is empty"));

        System.out.println("19) Given the array {10, 1, 20, 2, 100, 100, 100}, write java code using" +
                "java stream to determine the number of occurrences of a particular value");
        int[] values = {10, 1, 20, 2, 100, 100, 100, 2};
         int num = 2;
         long count = Arrays.stream(values).filter( x -> x == num).count();
        System.out.println(count);

        System.out.println("20) how to find only duplicate elements with its count from the String ArrayList in java 8");
        List<String> words1 = List.of("Prajwal", "Pranit", "Pratik", "Pranit", "Yash", "Yash");

        Map<String, Long> map =  words1.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        map.entrySet().stream().filter(e -> e.getValue()>1).forEach(e -> System.out.println(e.getKey() + " : "+e.getValue()));

        System.out.println("21) write a program to give sum of salary of employee.");
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Prajwal", 80000));
        employees.add(new Employee("Pratik", 70000));
        employees.add(new Employee("Pranit", 90000));
        employees.add(new Employee("Yash", 60000));
        employees.add(new Employee("Pranit", 40000));

        Double salarySum = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(salarySum);

        System.out.println("22) write a program to print the count of each character is string using stream");
        String values2 = "dewonkaooqoeirygcvxmallaoqppeijxnaa1.;l,shtqicb";
        Map<Character, Long> charCount = values2.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);

        System.out.println("23) how to convert a list of objects into a map by considering duplicated keys and store them in sorted order");
        Map<String, Double> uniqueEmployee = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary, (existing, replacement) -> existing
                ,() -> new TreeMap<>(Comparator.naturalOrder())));
        System.out.println(uniqueEmployee);



    }
}
