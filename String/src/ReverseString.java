class ReverseString {
	
	// It's my Logic
	
	public static void main(String[] args) {
//		String str = "Hello World";
//		char[] arr = str.toCharArray();
//		// char[] arr1 = {};// it gives exception because you are creating an empty array with a length of 0. 
//		                 // This means you cannot store any elements in arr1,
//		                           
//		                 // leading to an ArrayIndexOutOfBoundsException when you try to assign values to it.		
//		char[] arr1 = new char[arr.length];
//		int j =0;
//	
//		
//		for(int i=(arr.length)-1 ; i>=0 ; i--) {
//			arr1[j] = arr[i];
//			j++;
//		}
//		System.out.println(arr1.length);
//		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.print(arr1[i]);
//		}
		
		
		 
		
		// it's Sir logic
		
		String str = "Hello World";
		String rev_str = "";
		for(int i = str.length() - 1;i>=0;i--) {
			rev_str += str.charAt(i); 
		}
		System.out.print(rev_str);
			
	}

}
