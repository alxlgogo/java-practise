package com.wenjing.algorithm;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciIterative(10);
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
    }

    public static int fibonacciIterative(int n) {

        //0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
//            System.out.println(String.format("a: %s, b: %s, c: %s", a, b, c));
        }
        return b;
    }
}
