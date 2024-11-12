
 class SringBufferAndStringBuilder {
   
	 public static void main(String[] args) {
		 // StringBuffer is a thread safe
//		 StringBuffer str1 = new StringBuffer("Hello");
//		 
//		 System.out.println(str1);
//		 
//		 StringBuffer str2 = str1.append(" World");
//		 System.out.println(str2);
//		 System.out.println(str1 == str2);
//		 
//		 
//		 
//		 
//		 StringBuilder str3 = new StringBuilder("Hello");
//		 System.out.println(str3);
//		 
//		 StringBuilder str4 = str3.append(" World");
//		 System.out.println(str4);
//		 System.out.println(str3 == str4);
		 
		 StringBuffer str = new StringBuffer("Bing");
		 System.out.println(str);
		 str.setCharAt(1, 'a');
		 System.out.println(str);// same string gets modified without creating new object when string modified
		 
		 StringBuffer str1 = new StringBuffer("Bing");
		 
		 System.out.println(str1);// hello
		 str1.deleteCharAt(2);
		 System.out.println(str1);
		 
		 
		 StringBuffer str4 = new StringBuffer("color");
		 System.out.println(str4);
		 str4.insert(4, 'u');
		 System.out.println(str4);
		 
		 StringBuffer str5 = new StringBuffer("Hello World");
		 
		 System.out.println(str5);
		 str5.delete(5, 11); // both the parameter are exclusive in nature means between two parameter String gets deleted
		 System.out.println(str5);
		 
		 
		 // all the above operations can be perform on the object of StringBuilder class
		 // because StringBuilder class contains all the above mentioned methods.
	 }
}
