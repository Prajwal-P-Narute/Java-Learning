package com.java.multithreading;

public class FirstThread extends Thread{

    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("value of thread "+i);
        }

    }

    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();

        FirstThread t2 = new FirstThread();
        t1.start();
        t2.start();

    }
}
