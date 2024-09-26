package com.wenjing.threads;

public class MultiThreadMain {
    public static void main(String[] args) {
//        MultiThread multiThread1 = new MultiThread(1);
//        multiThread1.start();
//
//        MultiThread multiThread2 = new MultiThread(2);
//        multiThread2.start();

        MultiThreadRunnable multiThreadRunnable1 = new MultiThreadRunnable(3);
        new Thread(multiThreadRunnable1).start();

        MultiThreadRunnable multiThreadRunnable2 = new MultiThreadRunnable(4);
        new Thread(multiThreadRunnable2).start();
    }
}
