package com.java.StreamPrograms;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class CountOfEachCharacters {
    public static void main(String[] args) {
        String str = "hello World";

        Map<Character, Long> characterFrequency = str.chars()
               .filter(c -> c !=' ')
                .mapToObj( c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        characterFrequency.forEach( (characters, frequency) -> System.out.println(characters+":"+frequency));
    }
}
