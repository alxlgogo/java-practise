package com.wenjing.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {

//    As part of the interview process, you are asked to create a Java application.
//
//    The following iterative sequence is defined for the set of positive integers:
//
//    n → n/2      (n is even)
//    n → 3n + 1 (n is odd)
//
//    Using the rule above and starting with 13, we generate the following sequence:
//
//            13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
//    Although it has not been proved yet, consider that all starting numbers finish at 1.
//
//    Which starting number, under 10000, produces the longest chain?


    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        for (int i = 1; i <= 10000; i++) {
            int size = print(i);
            if (maxLength < size) {
                maxLength = size;
            }
            hashMap.put(i, size);
        }

        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value == maxLength) {
                Integer key = entry.getKey();
                System.out.println(key);
            }
        }
        print(77031);
    }

    public static int print(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num);
        int temp = num;
        while (temp != 1) {
            if (temp % 2 == 0) {
                temp = temp / 2;
                list.add(temp);
            } else {
                temp = 3 * temp + 1;
                list.add(temp);
            }
        }
//        System.out.println(list);
        return list.size();
    }
}
