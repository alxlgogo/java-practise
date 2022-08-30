package com.wenjing.recursion;

/**
 * Base Case
 * Recursion Relation
 */
public class Recursion {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }

    public static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return 0;
        }
    }

    // 1 1 2 3 5 8 13
    // 3 = 1 + 2
    // 4 = 3 + 2
    // 5 = 4 + 3
    // n = n + (n-1)

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + sum(n - 2);
        }
    }
}
