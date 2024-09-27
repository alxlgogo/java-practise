package com.wenjing.interview;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // GAGCCTACTAACGGGAT
        // CATCGTAATGACGGCCT
        // ^ ^ ^  ^ ^    ^^
//        String str1 = "GAGCCTACTAACGGGAT";
//        String str2 = "CATCGTAATGACGGC";
//        System.out.println(hamming(str1,str2));

        /**
         * // Data record: [10, 20, 30]
         * // Time period: 2 seconds
         * // Moving average: [ (10+20)/2, (20+30)/2 ] = [15,25]
         *  15, 25 , 35, 45
         */
//        movingAverage(new int[]{10, 20, 30, 40, 50});

        System.out.println(factorial(3)); // 6
        System.out.println(factorial(5)); // 120

        // fact(3) = 3 * 2 * 1 = 6
        // fact(3) = 1 * 2 * 3 = 6


    }

    private static int factorial(int number) {
        int resultNumber = 1;
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                continue;
            }
            resultNumber = resultNumber * i;
        }
        return resultNumber;
    }
//
//    private static void movingAverage(int[] ints) {
//        int[] ints1 = new int[ints.length - 1];
//        for (int i = 0; i < ints.length; i++) {
//            if (i + 1 == ints.length) {
//                continue;
//            }
//            int res = (ints[i] + ints[i + 1]) / 2;
//            ints1[i] = res;
//        }
//
//        for (int arr : ints1) {
//            System.out.println(arr);
//        }
//
//    }
//
//    public static int hamming(String str1, String str2) {
//        if (str1.isBlank() || str2.isBlank()) {
//            return 0;
//        }
//        int count = 0;
//        char[] chars1 = str1.toCharArray();
//        char[] chars2 = str2.toCharArray();
//        for (int i = 0; i < chars1.length; i++) {
//            if (chars1[i] != chars2[i]) {
//                count++;
//            }
//        }
//        return count;
//    }


}
