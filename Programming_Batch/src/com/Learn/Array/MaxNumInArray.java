package com.Learn.Array;

class MaxNumInArray {

	public static void main(String[] args) {
		int [] arr = {2, 4, 56, 12, 78, 34};
		
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
       System.out.println(max);
       
       
       
       // 
       int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
      System.out.println(min);
	}
	
	

}
