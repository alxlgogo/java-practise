package com.wenjing.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(0);
        System.out.println(list);


        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

    }
}
