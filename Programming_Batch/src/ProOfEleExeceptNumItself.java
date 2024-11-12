/*
 * Given an array nums of n integers where n > 1, 
 * return an array output such that output[i] is equal to 
 * the product of all the elements of nums except nums[i].

    Test Case 1: 

	Input: [1, 2, 3, 4] 
Output: [24, 12, 8, 6]


Test Case 2: 

	Input: [2, 3, 4, 5]
Output: [60, 40, 30, 24]


 */



public class ProOfEleExeceptNumItself {
	
	
	public static int [] product(int [] arr) {
		
		// creating new array for storing the product elements
		int[] new_arr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			int product = 1;
			for(int j=0;j<arr.length;j++) {
				
				if(i!=j) {
					product = product * arr[j];
				}
			}
			
			new_arr[i] = product;
		}
		
		return new_arr;
	}
	
	
	public static void main(String[] args) {
		
		int [] arr = {2,1,4,5,3};
		
		int [] result = product(arr);
		
		// for printing of product of elements of an array
		for(int i=0;i<result.length;i++) {
			
			System.out.print(result[i] + " ");
		}
	}

}
