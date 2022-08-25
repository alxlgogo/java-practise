package com.wenjing.array;

import java.util.ArrayList;

public class ArrayContains {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        boolean contains = arr1.contains(2);
        boolean contains1 = arr1.contains("2");
        System.out.println(contains + "   " + contains1);
    }
}
