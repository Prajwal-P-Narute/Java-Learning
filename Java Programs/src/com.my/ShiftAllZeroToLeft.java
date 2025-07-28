package com.my;

public class ShiftAllZeroToLeft {
    public static void main(String[] args) {
        int []arr = {1, 0, 9, 7, 0, 8, 0, 4, 9 ,0 };

        // with using SECOND array time complexity O(n) and time complexity O(n)
//        int arr2[] = new int[arr.length];
//
//        int count = 0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == 0)
//                count++;
//        }
//
//        int count1 = count;
//        int j = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] != 0){
//                arr2[count1] = arr[i];
//                count1++;
//            }else{
//                arr2[j] = arr[i];
//                j++;
//            }
//
//        }


        // without using SECOND array space complexity O(n) time complexity O(n)

        int right = arr.length -  1;

        for(int i= arr.length - 1;i>=0; i--){

            if(arr[i] != 0){
                arr[right] = arr[i];
                right--;
            }
        }

        while(right>=0){
            arr[right] = 0;
            right--;
        }

        for (int a:arr){
            System.out.println(a);
        }
    }
}
