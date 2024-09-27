package com.wenjing.algorithm;

import java.util.Arrays;
import java.util.stream.Stream;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8, 9, 9};
        int[] ints = plusOne(digits);
        System.out.println(ints);
    }

    public static int[] plusOne(int[] digits) {
        int currentIndex = digits.length - 1;
        int currentNumber = digits[currentIndex];
        int[] newDigits = digits.clone();
        if (currentNumber != 9) {
            newDigits[currentIndex] = newDigits[currentIndex] + 1;
            return newDigits;
        } else {
            int[] newArr = new int[digits.length];
            int extraNumber = 0;
            for (int i = digits.length - 1; i >= 0; i--) {
                int digit = digits[i];
                if (i == digits.length - 1) {
                    extraNumber = 1;
                    digit = 0;
                    newArr[i] = digit;
                } else {
                    if (digit + extraNumber == 10) {
                        extraNumber = 1;
                        digit = 0;
                        newArr[i] = digit;
                    } else {
                        newArr[i] = digit + extraNumber;
                        extraNumber = 0;
                    }
                }
            }
            if (extraNumber == 1) {
                int[] newArr3 = new int[newArr.length + 1];
                System.arraycopy(newArr, 0, newArr3, 1, newArr.length);
                newArr3[0] = 1;
                newArr = newArr3;
            }
            if (newArr[0] != 0) {
                return newArr;
            } else {
                int[] newArr2 = new int[newArr.length - 1];
                for (int i = 1; i < newArr.length; i++) {
                    newArr2[i - 1] = newArr[i];
                }
                return newArr2;
            }
        }
    }
}
