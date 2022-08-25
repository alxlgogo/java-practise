package com.wenjing.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        String a[] = {"A", "E", "I"};
        String b[] = {"O", "U"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(a));
        arrayList.addAll(Arrays.asList(b));
        System.out.println(arrayList);
    }
}
