package com.wenjing.algorithm;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 5, 5, 8, 9);
//        int index = getIndex(numbers);
//        System.out.println(index);

        findTheLastElementGreatThan5(numbers);
    }

    //1.Find the first element >= 5;
    public static int getIndex(List<Integer> numbers) {
        int leftIndex = -1;
        int rightIndex = numbers.size();
        int middle;
        while (leftIndex + 1 != rightIndex) {
            middle = (leftIndex + rightIndex) / 2;
            if (numbers.get(middle) < 5) {
                leftIndex = middle;
            } else {
                rightIndex = middle;
            }
        }
        return rightIndex;
    }


    /**
     * Condition >5 ->right , return leftIndex(the last one)
     */
    public static int findTheLastElementGreatThan5(List<Integer> numbers) {
        int leftIndex = -1;
        int rightIndex = numbers.size();
        int middle;
        while (leftIndex + 1 != rightIndex) {
            middle = (leftIndex + rightIndex) / 2;
            if (numbers.get(middle) > 5) {
                rightIndex = middle;
            } else {
                leftIndex = middle;
            }
        }
        String message = String.format("TheLastElementGreatThan5 index: %s", leftIndex);
        System.out.println(message);
        return leftIndex;
    }
    //2.Find the last element >= 5;
    //3.Find the first element > 5;
    //4.Find the last element <= 5;
}
