package com.java.multithreading;

public class JoinMethodInThread extends Thread{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Current Thread Name " + Thread.currentThread().getName()+ " and Value is "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        JoinMethodInThread t1 = new JoinMethodInThread();
        JoinMethodInThread t2 = new JoinMethodInThread();


        t1.start();
        t1.join();
        // until complete excution of thred -0 the thread-1 is not started its execution
        // it is possible by using join() method
        // it helps to not execute threads simultaneously

        t2.start();
        t1.join();

        // until complete excution of thred -1 the thread-0 is not started its execution
    }
}
