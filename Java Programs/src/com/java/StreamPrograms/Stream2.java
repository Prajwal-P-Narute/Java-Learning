package com.java.StreamPrograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 2, 22, 5, 10, 13, 7, 22, 34, 10, 6);

        //        printing all elements in ascending i.e natural order
        System.out.println(list1.stream().sorted().collect(Collectors.toList()));

        //        printing all elements in natural i.e ascending order but remove duplicates
        System.out.println(list1.stream().sorted().distinct().collect(Collectors.toList()));

//        printing all elements in reverse order
        System.out.println(list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        //        printing all elements in reverse order but remove duplicates
        System.out.println(list1.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList()));

//        Finding Second highest number from an Unsorted List

//        skip(n) :- Returns a stream consisting of the remaining elements of this stream after
//        discarding the first n elements of the stream.
//   If this stream contains fewer than n elements then an empty stream will be returned.
//        findFirst():- Returns an Optional describing the first element of this stream,
//        or an empty Optional if the stream is empty.
//        If the stream has no encounter order, then any element may be returned.
//        get():- If a value is present, returns the value, otherwise throws NoSuchElementException.
        System.out.println(list1.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get());

//        Finding Forth highest number from an Unsorted List
        System.out.println(list1.stream().sorted(Comparator.reverseOrder()).distinct().skip(3).findFirst().get());

//        find the second Number present in the list without using loop
        System.out.println(list1.stream().skip(1).findFirst().get());

//.      From a list of integers, filter all numbers starting with 1.
        System.out.println(list1.stream().filter(num -> num.toString().startsWith("1")).collect(Collectors.toList()));

//        find duplicates numbers from list
        Set<Integer> set1 = new HashSet<>();
        System.out.println(list1.stream().filter(num -> !set1.add(num)).collect(Collectors.toList()));

//        remove duplicates from list
        Set<Integer>set2 = new HashSet<>();
        System.out.println(list1.stream().filter(num -> set2.add(num)).collect(Collectors.toList()));

        //        find duplicates words from list of string
        List<String>words1 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grapes");
        Set<String>set3 = new HashSet<>();
        System.out.println(words1.stream().filter(word -> !set3.add(word)).collect(Collectors.toList()));

//        Write a program to count the frequency of each character in a string using Streams.
        String str1 = "Hi My Name is Prajwal Narute";

        Map<Character, Long> charFrequency = str1.toLowerCase() // convert to lowercase
                .chars() // returns IntStream
                .mapToObj(ch -> (char)ch) // convert int to Character
                .filter( ch -> ch != ' ')  // ignore spaces
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        charFrequency.forEach((ch, count) -> System.out.println(ch+"-"+count));
        System.out.println("-----------------------------------------");
        for (Map.Entry<Character, Long> charFrequency2:charFrequency.entrySet()){
            System.out.println(charFrequency2.getKey()+"-"+charFrequency2.getValue());
        }

//    IMP:-    given a String and you have to convert all the characters of the string into upper case

        String str2 = "Prajwal";

//         by using method references
       String result1 =  str2.chars() // gets an IntStream of character codes.
                .mapToObj( ch -> (char)ch)//  converts each int to a char.
                .map(Character::toUpperCase)// converts each character to uppercase.
                .map(String::valueOf) // converts each char to a String.
                .collect((Collectors.joining())); // joins them back into a single string.
        System.out.println(result1);

//         we can write above code also using simple wat
        String result2 = str2.chars()
                .mapToObj(ch -> (char)ch)
                .map(ch -> Character.toUpperCase(ch))
                .map(ch -> String.valueOf(ch))
                .collect(Collectors.joining());

        System.out.println(result2);

//        Find a list of names starting with the letter 'A'

        List<String> list2 = List.of("Prajwal","Aniket", "amol", "Prashant", "Swaraj", "Ajit");

        List<String>filteredNames = list2.stream().
                filter(name -> name.startsWith("A") || name.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);


    }




}
