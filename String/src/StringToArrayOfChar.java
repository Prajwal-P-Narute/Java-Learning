
 class StringToArrayOfChar {
	 
	 public static void main(String[] args) {
     String str = "Hello world";
     char[] arr = str.toCharArray();
     
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
}
}