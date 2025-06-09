package com.java.GenericInterface;

import java.util.Arrays;

public class ImplementedClass {
    public static void main(String[] args) {
        A<Integer> a = () ->{
            return 12;
        };

        System.out.println(a.m1());

        A<String> a1 = () ->{
          return "Prajwal";
        };
        System.out.println(a1.m1());

        A<int[]> a3 = ()->{
          return new int[]{3, 5, 1, 6, 3};
        };

        System.out.println(Arrays.toString(a3.m1()));

        B<Integer, String> b1 = (value) ->{
          return "Prajwal Narute";
        };

        System.out.println(b1.m1(67));

        B<int[], Integer> b2 = (arr) ->{
          Integer length =  arr.length;
          return  length;
        };
        System.out.println(b2.m1(new int[]{4, 6,42, 56, 2,3,5 ,6}));
    }


}