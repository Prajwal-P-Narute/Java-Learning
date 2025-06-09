package com.java.multithreading;

public class SecondThread implements Runnable{

    // Traditional way to wright logic for run() method
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("value of thread "+i);
        }

    }

    public static void main(String[] args) {

        SecondThread t1 = new SecondThread();
//        t1.run();

        Thread thread1 = new Thread(t1);

        Thread thread2 = new Thread(new SecondThread());

        thread1.start();
        thread2.start();

//        thread1.run();
//        thread2.run();

    }
}
