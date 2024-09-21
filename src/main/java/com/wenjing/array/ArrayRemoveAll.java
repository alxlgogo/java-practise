package com.wenjing.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRemoveAll {
    public static void main(String[] args) {

        /**
         * Arrays.asList() is a fixed-size list, so you cannot modify it.
         * List<Integer> numbers1 = Arrays.asList(3, 4, 5, 6, 7);
         * List<Integer> numbers2 = Arrays.asList(4, 5);
         * numbers1.remove(numbers2);
         */

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(4, 5, 9));
        boolean removeAll = numbers1.removeAll(numbers2);
        System.out.println(removeAll);

        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        List<Integer> numbers4 = new ArrayList<>(Arrays.asList(4, 5, 9));
        numbers3.retainAll(numbers4);
        System.out.println();
    }
}
