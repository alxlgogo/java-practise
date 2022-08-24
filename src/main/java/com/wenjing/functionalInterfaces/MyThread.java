package com.wenjing.functionalInterfaces;

public class MyThread {
    public static void main(String[] args) {
        runThread1();
        runThreadWithLambda();
    }

    public static void runThread1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: " + Thread.currentThread().getName() + " is Running");
            }
        }).start();
    }

    // () stands for no parameter
    public static void runThreadWithLambda() {
        new Thread(() -> {
            System.out.println("Lambda Thread: " + Thread.currentThread().getName() + " is Running");
        }).start();
    }

}
