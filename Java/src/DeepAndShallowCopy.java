import java.util.Arrays;


// in case of deep copy changes made in copied object will reflect inside original object
// But in case of shallow copy changes made in copied object will not be reflected inside
// original object.

class DeepAndShallowCopy {
	 
	 public static void main(String[] args) {
		 
		 // Deep Copy
   int[] arr1 = {2, 3, 4, 5, 1, 6};
   
   int [] arr2 = arr1; // Deep Copy
   System.out.println(arr1);
   System.out.println(arr2);
   
   for(int num:arr1) {
	   System.out.print(num);
   }
   System.out.println();
   
   for(int num:arr2) {
	   System.out.print(num);
   }
   System.out.println();
   
   
   
   
   // Shallow Copy 1
   
   int[] arr3 = new int[arr1.length];
   
   int index = 0 ;
   for(int num: arr1) {
	   arr3[index] = num;
	   index ++;
   }
   
   System.out.println(Arrays.toString(arr3));
   System.out.println(arr1);
   System.out.println(arr3);
   
   
// Shallow Copy 2
   
   int [] arr4 =  arr1.clone(); // shallow copy
   System.out.println(Arrays.toString(arr4));
   System.out.println(arr1 == arr4);
   
   
   
}
}