package com.wenjing.algorithm;

import java.util.*;
import java.util.stream.Stream;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int sum = (1 + 99) * 99 / 2;
        Integer[] numbers = {1, 2, 4, 6, 9};
        Integer sumAll = Stream.of(numbers).reduce(0, (a, b) -> a + b);
        List<Integer> missingNumbers = findTheMissingNumber(numbers, 19);
        System.out.println(missingNumbers);


    }

    public static List<Integer> findTheMissingNumber(Integer[] numbers, int rangeNumber) {
        Map<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i <= rangeNumber; i++) {
            hashMap.put(i, false);
        }
        for (Integer number : numbers) {
            Boolean exist = hashMap.get(Integer.valueOf(number));
            if (exist != null) {
                hashMap.remove(number);
            }
        }
        return new ArrayList<>(hashMap.keySet());
    }
}
