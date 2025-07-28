package com.my;

class SumOfEvenDigitsInString {

	public static void main(String[] args) {
		String str = "Hello@2345#World$7373";
		int sum = 0;
	  for(int i=0;i<str.length();i++) {
		  if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			  int d = str.charAt(i) - '0';
			  if(d % 2 == 0) {
				sum += d;  
			  }
		  }
	  }
   System.out.println(sum);
   
   
   
  

	}

}
