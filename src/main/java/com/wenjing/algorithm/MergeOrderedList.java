package com.wenjing.algorithm;

import java.util.*;

public class MergeOrderedList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 6, 3, 2, 9);
        List<Integer> list2 = Arrays.asList(2, 5, 5, 2, 12);
        List<Integer> totalList = new ArrayList<>();
        totalList.addAll(list1);
        totalList.addAll(list2);
        System.out.println(totalList);
        Collections.sort(totalList, Comparator.comparingInt(e -> e));
        System.out.println(totalList);

    }
}

