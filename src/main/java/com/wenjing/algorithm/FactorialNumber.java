package com.wenjing.algorithm;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.print(getFactorialNumber(n) + " ");

    }

    public static long getFactorialNumber(int number) {
        if (number == 0) {
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
