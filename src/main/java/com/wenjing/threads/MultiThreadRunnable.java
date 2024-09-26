package com.wenjing.threads;

public class MultiThreadRunnable implements Runnable{
    private int number;

    public MultiThreadRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(String.format("Runnable, Number: %s From thread: %s", i, this.number));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
