package com.java.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamMain {
    public static void main(String[] args) throws FileNotFoundException {


        // First way to create Stream
        Stream<Integer> stream = Stream.of(3, 5, 2, 5, 7, 8, 9);
//        stream.forEach((e) -> System.out.print(e));

//       Stream<Integer>filter =  stream.filter(e-> e>6);
//        Stream<Integer>filter =  stream.filter(e-> e%2 == 0);
//
//        filter.forEach((e) -> System.out.print(e));

        // Sencond way to create stream . it gives the range of values
//        IntStream intStream= IntStream.range(1, 12);
//        IntStream intStream= IntStream.range(5, 27);
//        intStream.forEach(e -> System.out.println(e));

        // forth way to create stream
        String[] names = {"One", "two", "three"};
        Stream<String>stream2 = Arrays.stream(names);

        // third way to create stream
//        List<Integer> list = List.of(45, 32, 12, 67, 26, 84, 59, 92);
//        Stream<Integer>streamList = list.stream();
//        Stream<Integer> filterStream = streamList.filter(e -> e>30);
//        filterStream.forEach(e -> System.out.println(e));


        // The above code we can also write in consized way like below code
        // List.of() method is introduced in java 16 version
//        List<Integer> list = List.of(45, 32, 12, 67, 26, 84, 59, 92);
//        list.stream().filter(e -> e>30).forEach(e -> System.out.println(e));

        // we can read the file also by using stream
//        FileReader fileReader = new FileReader("src/com/java/stream/prajwal.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//       Stream<String>lines =  bufferedReader.lines();
//       lines.forEach(e -> System.out.println(e));

       // we can write above code in consise way

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/java/stream/prajwal.txt"));
//        Stream<String>lines = bufferedReader.lines();
//        lines.forEach(e -> System.out.println(e));

//        INTERMEDIATE OPERATION

        // sorting words in list in reverse order
        List<String> names2 = Arrays.asList("Prajwal", "Onkar", "Mahesh", "Avinash", "Yash");

        List<String>reversedNames = names2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedNames);

        // Print each element in a list while converting them to uppercase
        // peek() method

        List<String> uppercaseWords = names2.stream().peek(w -> System.out.println(w)).map( words -> words.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseWords);

        // limit()
        // fetch the first 3 elements from a list of intergers

        List<Integer>numbers = Arrays.asList(2, 5, 7, 2, 8, 8, 12, 68);
        System.out.println(numbers.stream().limit(3).collect(Collectors.toList()));

        // skip()
        // skip the first 4 elements and fetch the remaining elements from a list of intergers.
        System.out.println(numbers.stream().skip(4).collect(Collectors.toList()));

        // TERMINAL OPERATIONS:-
//        forEach()
//        print each elements of a list with a prefix "Item"
        List<String> words = Arrays.asList("Onkar", "Prajwal", "Pranit", "Yash", "Aniket", "Nilesh");
        words.stream().forEach(word -> System.out.println("Items "+word));

        // collect()
        // collect list of intergers into set
       Set<String> words1 = words.stream().collect(Collectors.toSet());
        System.out.println(words1);

        // reduce()
        // compute the product of a numbers in a list
        // the reduce method in java streams is used to perform a reduction on the elements of a stream.
//        combining them into a single result. it applies binary operation( a function that takes two arguments
//         and returns a single result) to the elements of the stream, repeatedly, until an elements have been
//        processed and a single remains.
        List<Integer>numbers1 = Arrays.asList(1, 2, 3, 4, 5);
       Optional<Integer> result = numbers1.stream().reduce((a, b) -> a * b);
        System.out.println(result.get());

        // SHORT-CIRCUITING AND TERMINAL OPERATION
//        allMatch()
//       the allMatch method in java streams is used to check if all elements in the stream satisfy a
//        given predicate. it returns true if every elements in the stream matches the predicate, and
//                false otherwise
//        Short-Circuiting: the allMatch operation i short-circuiting meaning it stops processing as
//        soon as it finds the first elements that does not match the predicate. if finds such an elements
//        , it immediately returns false.
        boolean res = numbers1.stream().allMatch(n -> n>0);
        System.out.println(res);

        //anyMatch()
//       it checks at least one element in the stream matches a given predicate.
        // it return true as soon as it finds an element that satisfies the predicate and stops
        // further processing, if no elements match, it returns false.

        boolean res2 = numbers1.stream().anyMatch( n -> n>4);
        System.out.println(res2);

//        noneMatch()
        // is used to check if no elements in the stream match a given predicate. it return true if none
//        of the elements satisfy the predicate and false if at least one element does
        boolean res3 = numbers1.stream().noneMatch(n -> n<0);
        System.out.println(res3);

        // findFirst()
        // it is used to retrieve the first element in a stream that matches a given condition or
        // simply the first element in the stream if no filtering is applied.
        // it returns the first element wrapped in an optional, which is a container object
        // that may or may not contain a non-null value.

Optional<String> word1 =   words.stream().filter(word -> word.startsWith("P")).findFirst();
        System.out.println(word1.get());

        // findAny()
        // retrieve any element from the stream that matches a given condition.
        // or simply any element from the stream if no filtering is applied.

       Optional<String> words2 =  words.stream().filter(w -> w.startsWith("C")).findAny();
        System.out.println(words2);

        //max and min
       Optional<Integer> maxNum =  numbers1.stream().max(Integer::compareTo);
        System.out.println(maxNum.get());

        Optional<Integer> minNum =  numbers1.stream().min(Integer::compareTo);
        System.out.println(minNum.get());

 // toArray()
    // convert a list of strings into an array
   Integer[] arr =  numbers1.stream().toArray(Integer[]::new);



   //joining()
//        it is used to concatenate the elements of a stream into a single string.
//        it's part of the Collectors utility class and provides a convenient way
//        to aggregate elements into a string format with optional delimiters, prefixes,and suffiexes.

        String wordsSepByCommawords = words.stream().collect(Collectors.joining(", "));
        System.out.println(wordsSepByCommawords);

        String wordsWithPrefixAndSuffix = words.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(wordsWithPrefixAndSuffix);

        




    }
}
