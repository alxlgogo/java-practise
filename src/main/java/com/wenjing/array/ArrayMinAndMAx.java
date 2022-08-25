package com.wenjing.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMinAndMAx {
    public static void main(String[] args) {
        printMinandMax();
    }

    public static void printMinandMax() {
        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        Integer min = Collections.min(Arrays.asList(numbers));
        Integer max = Collections.max(Arrays.asList(numbers));
        System.out.println(min + "----" + max);
    }
}
