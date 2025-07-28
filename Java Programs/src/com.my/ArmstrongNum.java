package com.my;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 371;
        int copy = num;
        int compare = num;

        int digits = 0;
        while(num != 0){
            digits++;
            num/=10;
        }


        int sum = 0;
        while (copy!=0){

            int dig = copy%10;
            int prod = 1;
//            for(int i=1;i<=digits;i++){
//                prod*=dig;
//            }
//            sum = sum + prod;

            sum += Math.pow(dig, digits);
            copy/=10;
        }

        if( compare == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not a Armstrong");
        }
    }
}
