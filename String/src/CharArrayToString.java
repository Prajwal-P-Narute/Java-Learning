
 class CharArrayToString {
       public static void main(String[] args) {
    	   char[]arr = { 'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
    	   String str = new String(arr); // this object is created in heap area
    	   System.out.println(str);
    	   
    	   
    	   String str2 = ""; // this object is created inside String constant pool
    	   for(int i=0;i<arr.length;i++) {
    		   str2 += arr[i];
    	   }
    	   System.out.println(str2);
       }
}
