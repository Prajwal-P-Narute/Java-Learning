package com.my;

public class WideningAndNarrowing {
         public static void main(String[] args) {
        	 Widening(123);
        	 Narrowing(123.67);
         }
         
         public static void Widening(int num) {
        	 double value  = num;
        	 System.out.println("The number before widening i.e int "+num);
        	 System.out.println("The number after widening i.e double " +value);
        	 
        	 
         }
         public static void Narrowing(double num) {
        	 int value = (int)num;
        	 
        	 System.out.println("The number before Narrowing i.e double type "+num);
        	 System.out.println("The number after Narrowing i.e int "+value);
         }
}
