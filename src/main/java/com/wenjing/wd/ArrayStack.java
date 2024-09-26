package com.wenjing.wd;

import java.util.Arrays;

public class ArrayStack {
    static int[] array;
    static int[] targetArray;


    public static void push(int number) {
        if (array == null) {
            array = new int[]{number};
            targetArray = array;
        } else {
            targetArray = new int[array.length + 1];
            targetArray = Arrays.copyOf(array, array.length + 1);
            targetArray[array.length] = number;
            array = targetArray;
        }
    }

    public static void pop() {
        targetArray = Arrays.copyOf(array, array.length - 1);
        array = targetArray;
    }

    public static boolean isEmpty() {
        return array != null && array.length > 0 ? false : true;
    }

    public static int[] getTargetArray() {
        return targetArray;
    }


}
