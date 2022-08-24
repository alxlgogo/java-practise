package com.wenjing.algorithm;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2, 3};
        int pre = solution1(A);
        System.out.println(pre);
    }

    public static int solution(int[] A) {
//        int n = A.length + 1;
//        int sumOfAllElements = (n * (1 + n)) / 2;
//        int sum = 0;
//        for (int var : A) {
//            sum += var;
//        }
//        String abc = "asd";

        return 1;
    }

    public static int solution1(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        Arrays.sort(A);
        if (A[0] != 1) {
            return 1;
        }
        int missingNumber = 0;
        int temp = A[0];
        for (int var : A) {
            if (var - temp > 1) {
                missingNumber = temp + 1;
                break;
            } else {
                temp = var;
            }
        }
        if (A[A.length - 1] == temp) {
            missingNumber = temp + 1;
        }
        return missingNumber;
    }
}
