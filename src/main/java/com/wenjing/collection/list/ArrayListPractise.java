package com.wenjing.collection.list;

import java.util.*;

public class ArrayListPractise {
    public static void main(String[] args) {
        AddInArrayList();
    }

    public static void AddInArrayList() {
        int[] intArr = {2, 1, 3};
        Arrays.sort(intArr);
        for (int var : intArr) {
            System.out.println(var);
        }

        List list = new ArrayList();
        list.add("123");
        list.add("21");
        list.add("3452");
        list.removeIf(e -> e == null);
        Collections.sort(list, Comparator.comparingInt(String::length));
        for (Object var : list) {
            System.out.println(var);
        }


    }
}
