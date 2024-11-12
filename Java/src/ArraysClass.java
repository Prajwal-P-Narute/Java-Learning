
import java.util.Arrays;
 class ArraysClass {
    public static void main(String[] args) {
    	int[] a = {2, 1, 4, 3, 5, 6, 8, 7, 9};
    	
//    	System.out.println("Array before sorting");
//    	System.out.println(Arrays.toString(a)); // here we override the toString() method to print the elements of an array
//    	
//    	System.out.println("Array after sorting");
//    	Arrays.sort(a);
//    	System.out.println(Arrays.toString(a));
    	
    	
    	
    	// Performing binary Search using Arrays class
    	
       int key = 3;
       Arrays.sort(a);// for performing binary search we have to first sort the array
       
       int index = Arrays.binarySearch(a, key);
       System.out.println(index);
       
       int[] arr = {5, 3, 2, 4, 1};
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]

    }
}
