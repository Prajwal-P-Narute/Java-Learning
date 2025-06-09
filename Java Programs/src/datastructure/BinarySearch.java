package datastructure;

import java.util.Arrays;

public class BinarySearch {


//    ITERATIVE APPROACH
    public static int binarySearchIterativeApproach(int [] arr, int start, int end, int key){



        while(start<= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
            // If element is smaller than mid, then
            // it can only be present in left subarray
            // so we decrease our r pointer to mid - 1
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            // Else the element can only be present
            // in right subarray
            // so we increase our l pointer to mid + 1
             else{
                start = mid + 1;
            }

        }

        return -1;

    }


    public static int binarySearchRecursiveApproach(int[]arr, int start, int end, int key){
        if (start <= end) {
            int mid = start + (end - start) / 2;

            // Returned Index of the Element
            if (arr[mid] == key)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > key)
                return binarySearchRecursiveApproach(arr, start, mid - 1, key);

            // Else the element can only be present
            // in right subarray
            return binarySearchRecursiveApproach(arr, mid + 1, end, key);
        }

        // No Element Found
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 78, 34, 12, 89};

        Arrays.sort(arr);
        int length = arr.length;
        int key = 12;

        int res = binarySearchRecursiveApproach(arr, 0, length - 1, key );

        if(res == -1){
            System.out.println(key+" is not present in given array");
        }else{
            System.out.println(key+ " is present of sorted array at index "+res);
        }


    }
}
