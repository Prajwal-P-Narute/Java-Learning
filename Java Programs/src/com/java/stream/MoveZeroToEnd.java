package com.java.stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        // shifting all zeroes to the right side of list using java 8 features
        List<Integer> numbers = List.of(1, -2, 0, 3 ,6, 0, 0, -5, -2);

        List<Integer> collect1 =  Stream.concat(numbers.stream().filter(n -> n!=0), numbers.stream().filter(n->n==0)).collect(Collectors.toList());
        System.out.println(collect1);
    }



}
