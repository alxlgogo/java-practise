package com.wenjing.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7};
        List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        numbers.remove(Integer.valueOf(3));
        numbers.remove(0);
        System.out.println(numbers);
    }



}
