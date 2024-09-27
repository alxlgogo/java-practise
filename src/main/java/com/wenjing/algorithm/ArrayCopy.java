package com.wenjing.algorithm;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] srcArr = {1, 2, 3, 4};
        int[] copyOf = Arrays.copyOf(srcArr, srcArr.length);
        for (int i = 0; i < copyOf.length; i++) {
            System.out.print(copyOf[i]);
        }
        System.out.println();

        int[] copyOf2 = Arrays.copyOf(srcArr, srcArr.length + 1);
        for (int i = 0; i < copyOf2.length; i++) {
            System.out.print(copyOf2[i]);
        }
        System.out.println();

        int[] arrayCopy = new int[srcArr.length + 1];
        System.arraycopy(srcArr, 0, arrayCopy, 1, srcArr.length);
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i]);
        }
        System.out.println();

        int[] copyOfRange = Arrays.copyOfRange(srcArr, 0, 7);
        System.out.println();
    }
}
