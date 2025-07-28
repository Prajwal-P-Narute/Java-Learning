package com.java.datastructure;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateFromArray {
// Simple Code
    public static List<Integer> findDuplicated(int[] arr){
        int length = arr.length;

        List<Integer> duplicates = new ArrayList<>();

        for(int i=0;i<length;i++){

            for(int j=i+1;j<length;j++){

                if(arr[i] == arr[j]){
                    if(!duplicates.contains(arr[i])){
                        duplicates.add(arr[i]);
                        break;
                    }

                }
            }
        }
        return duplicates;

    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 12, 56, 34, 67, 89, 56, 45, 45, 90, 12, 34, };

        List<Integer>duplicatesElement = findDuplicated(arr);

        System.out.println(duplicatesElement);
    }
}
