package com.java.multithreading;

public class RunnableInterfaceDemo{
    public static void main(String[] args) {
        // modern way to right logic for run method using lambda expression
        Runnable t1 = () ->{
            for (int i=0;i<10;i++){
                System.out.println("value of thread "+i);
            }
        };

        Thread thread1 = new Thread(t1);
        thread1.start();
    }

}
