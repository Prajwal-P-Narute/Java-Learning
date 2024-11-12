
public class TypeCasting {
      public static void main(String[] args) {
    	  
    	  // widening is performed here to convert byte data type to int
//    	  byte a = 20;
//    	  byte b = 10;
//    	  int c = a*b;
//    	  System.out.println(c);
    	  
    	  int a = 256;
    	  int b= 256;
    	  byte c = (byte) (a/b);
    	  System.out.println(c);
    	  
    	  //Narrowing
    	  int d = 65;
    	  
    	  char e = (char)d;
    	  System.out.println(e);
    	  
    	  short f = 65;
  		char ch = (char)f;  // narrowing is happen don't confuse
  		                      // short has size 2byte and char has size also 2byte
  		System.out.println(ch);
  		
  		char z = 97;
  		System.out.println(z);
  		char y = 65500;  // this also possible
  		System.out.println(y);
  		
  		
  		long n1 = 123;
  		float m1 = n1; // here widening is happened don't confuse we are converting long to float it is possible
  		               // because addition of data i.e decimal value.
  		System.out.println(n1);
  		System.out.println(m1);
  		
  		long n2 = 1234;
  		double m2 = n2;
  		System.out.println(n2);
  		System.out.println(m2); // here widening is happened we are converting long to double datatype.
  		
    	  
      }
}
