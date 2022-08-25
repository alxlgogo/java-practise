package com.wenjing.array;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {1, 2, 3, 4, 5};
        boolean equals = Arrays.equals(arr1, arr2);
        boolean equals1 = Arrays.equals(arr1, arr3);
        System.out.println(equals + " " + equals1);
    }
}
