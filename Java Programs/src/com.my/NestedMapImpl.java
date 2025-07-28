package com.my;

import java.util.HashMap;
import java.util.Map;

public class NestedMapImpl {
    public static void main(String[] args) {
        Map<String, Map<String, String>> map1 = new HashMap<>();

        map1.put("Prajwal", new HashMap<>()); // You're putting a key "Prajwal" into the outer map and
        // assigning a new empty HashMap<String, String> as its value.
        map1.get("Prajwal").put("Age", "22");  // you can add values to the inner map like this below
        System.out.println(map1);



        // Creating nested map in map in map
        Map<String, Map<String, Map<Integer, String >>> map2 = new HashMap<>();


        // Create the innermost map
        Map<Integer, String > innerMap = new HashMap<>();
        innerMap.put(1, "Java");


//        Create the middle map and add the innerMostMap to it

        Map<String, Map<Integer, String>> middleMap = new HashMap<>();
        middleMap.put("Backend", innerMap);

//        Add the middleMap to the outermost map

        map2.put("Prajwal", middleMap);

        System.out.println(map2);

    }
}
