package com.wenjing.threads;

public class MultiThread extends Thread {
    private int number;

    public MultiThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(String.format("Number: %s From thread: %s", i, this.number));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
