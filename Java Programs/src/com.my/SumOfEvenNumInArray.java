package com.my;

public class SumOfEvenNumInArray {
          public static void main(String[] args) {
        	  int[] arr = {2,0,4,12,17,19,20,23,25,28,46};
        	  
        	  int sum = 0;
        	  
        	  for(int i=0;i<arr.length;i++) {
        		  
        		  if(arr[i]%2==0) {
        			  System.out.println(arr[i]);
        			  sum += arr[i];
        		  }
        	  }
        	  System.out.println("Sum of even numbers in given array is "+sum);
          }
}
