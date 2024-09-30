package com.wenjing.algorithm;

public class Sqrt {
    public static void main(String[] args) {
        int root = mySqrt(20);
        System.out.println(root);
    }

    public static int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int) Math.abs(sqrt);
    }
}
