package com.java.multithreading;

public class MethodsInThread extends Thread{


    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Current Thread Name " +Thread.currentThread().getName());
            try {
                Thread.sleep(2000);// idle for 2sec
                System.out.println("value of thread: "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread after execution");
        }

    }

    public static void main(String[] args) {

        MethodsInThread t1 = new MethodsInThread();
        t1.setName("First Thread");
        t1.start();

        MethodsInThread t2 = new MethodsInThread();
        t2.setName("Second Thread");
        t2.start();
    }
}
