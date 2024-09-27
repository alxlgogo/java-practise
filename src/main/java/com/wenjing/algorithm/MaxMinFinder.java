package com.wenjing.algorithm;

public class MaxMinFinder {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, -2, 7, 4};
        findMaxMin(numbers);
    }

    public static void findMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else {
                min = array[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
