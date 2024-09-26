package com.wenjing.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-2, 2, 5, -11, 6);
        List<Integer> maximumSumSubarray = getMaximumSumSubarray(numbers);
        System.out.println(maximumSumSubarray);
    }

    public static List<Integer> getMaximumSumSubarray(List<Integer> numbers) {
        List<Integer> maxArrays = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            //1.
            //-2, 2, 5, -11, 6
            List<Integer> tempMaxArrays = new ArrayList<>();

            for (int i1 = 0; i1 < numbers.size(); i1++) {

            }

        }
        return null;
    }
}
