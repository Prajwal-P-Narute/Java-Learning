package com.my;

import java.util.Scanner;
public class LCMofTwoNumbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
    int max;
    if(a>b){
        max=a;
    }else{
        max=b;
    }

    while(true){

        if((max%a==0)&&(max%b==0)){
            ;
            System.out.println("The LCM of "+a+" and "+b+" is "+max);
            break;
        }
        max++;
    }

}
}
