package com.wenjing.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayElementsDuplicate {
    public static void main(String[] args) {
        findDuplicatedElementInArray();

    }

    private static void findDuplicatedElementInArray() {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int per : arr) {
            Integer integer = hashMap.get(per);
            if (integer == null) {
                hashMap.put(per, 1);
            } else {
                hashMap.put(per, integer + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> map : entries) {
            Integer value = map.getValue();
            if (value > 1) {
                Integer key = map.getKey();
                System.out.println(key + " is  duplicated element");
            }
        }
    }


}
