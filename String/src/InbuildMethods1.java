 class InbuildMethods1 {
     public static void main(String[] args) {
    	 
    	 // replace(arg1, arg2) method
    	 String str = "Hello World";
    	 String str2 = str.replace('l', 'L');
         System.out.println(str2);
         
         String str3 = str.replace("Hello", "Hi"); // enter word is replaced by 'Hi'
         System.out.println(str3);
         
         // indexOf() method
         System.out.println(str.indexOf("W"));
         System.out.println(str.indexOf('w')); // gives -1 because small w is not present in given string
         System.out.println(str.indexOf('a')); // if given char is not present in string then index is -1
         System.out.println(str.indexOf('l')); // it gives index of first 'l'
         
         System.out.println(str.indexOf("World"));
         System.out.println(str.indexOf("Hi"));
         System.out.println(str.indexOf(" World"));
         System.out.println(str.indexOf("Wrld"));
         System.out.println(str.indexOf("Hello"));
         
         System.out.println(str.indexOf('l', 4)); // this method overridden method gives index of 'l' after the index 4
         System.out.println(str.indexOf("ld", 5));
         
         
         // lastIndexOf() method
         System.out.println(str.lastIndexOf('l'));
         
         String str4 = "Hey Hello World";
         System.out.println(str4.lastIndexOf("He"));
         
         // contains() method
         System.out.println(str4.contains("ell"));
         System.out.println(str4.contains("ol"));
         
         String str5 = "Hello World";
         System.out.println(str5.startsWith("He"));
         System.out.println(str5.startsWith("Hi"));
         System.out.println(str5.endsWith("World"));
         System.out.println(str5.endsWith("Hello"));
         
         // split() method
         String[] arr = str5.split(" ");
         System.out.println(arr.length);	
         
         for(int i=0;i<arr.length;i++) {
        	 System.out.println(arr[i]);
         }
         
        String[] arr1 = str5.split("r");
         
         for(int i=0;i<arr1.length;i++) {
        	 System.out.println(arr1[i]);
         }
         
      String[] arr2 = str5.split("l");
         
         for(int i=0;i<arr2.length;i++) {
        	 System.out.println(arr2[i]);
         }
          
         
         
     }
}
