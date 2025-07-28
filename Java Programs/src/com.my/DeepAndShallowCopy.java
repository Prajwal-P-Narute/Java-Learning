package com.my;


// in case of deep copy changes made in copied object will not be reflect inside original object
// But in case of shallow copy changes made in copied object will be reflected inside
// original object.

class DeepAndShallowCopy {
	 
	 public static void main(String[] args) {
		 
		 // Shallow Copy
          int arr1[] = {2, 4, 2, 5, 2,};

          int arr2[] = arr1; // shallo copy

          arr2[0] = 100; // change in copied array.

         System.out.println(arr1[0]); // output:100 change in copied array is reflected to original array also


         // Deep Copy
         int arr3[] = {4, 2, 6, 7, 9, 0};
         int arr4[] = new int[arr3.length];

         // Deep Copy Using Loop
         for(int i=0;i<arr3.length;i++){
             arr4[i] = arr3[i];
         }

         arr4[0] = 100; // change in copied array
         System.out.println(arr3[0]);// outpu: 4 change in copied is not reflected to original array
   
   
}
}