
// its my logic
class UpperToLowerViceVersa {
           public static void main(String[] args) {
//        	   String str = "hElLo WorlD8";
//        	   char[] arr = str.toCharArray();
//        	   
//        	   for(int i=0;i<arr.length;i++) {
//        		   if(arr[i]>='a' && arr[i] <='z') {
//        			   arr[i] = (char) (arr[i] - 32);
//        		   }
//        		   else if(arr[i] >='A' && arr[i] <= 'Z') {
//        			   arr[i] =  (char)(arr[i] + 32);
//        		   }
//        		   else {
//        			   arr[i] = arr[i];
//        		   }
//        	   }
//        	   
//        	   for(int i=0;i<arr.length;i++) {
//        		   System.out.print(arr[i]);
//        	   }
        	   
        	   
        	   
        	   
        	   
 //           it is the logic of sir
        	   String str = "hElLo";
        	   String new_str = "";
        	   
        	   for(int i=0;i<str.length();i++) {
        		   char ch = str.charAt(i);
        		   
        		   if(ch>='a' && ch<='z') {
        			   new_str += (char) (ch - 32);  
        		   }
        		   else if(ch>='A' && ch<='Z') {
        			   new_str += (char) (ch  + 32);
        		   }
        		   else {
        			   new_str += ch;
        		   }
        	   }
        	   
        	   System.out.println(new_str);
//        	   
     }
}
