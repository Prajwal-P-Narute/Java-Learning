class TypeCasting1 {
	
	public static void main(String[] args) {
	// byte a = 20;
//	   byte b = 10;
////	   byte c = a + b; // error generates because if we want to add two byte number then it can goes out of range valu
//	                   // byte range is -127 to 128
//	                   // it must store the result of a and b in int c so lossy conversion is not occurs
//	   int d = a+b;
//	   System.out.println(d);
	   
//	   byte a = 20;
//	   short b = 40;
//	   byte c = a + b;
//	   System.out.println(c); // error generates because explained in above example
	   
	   int a = 30;
	   byte b = 20;
	   int c = a + b; 
	   System.out.println(c);
	                        // this compile successfully because here is no lossy conversion 
                           // and int can store byte data easily

}
}