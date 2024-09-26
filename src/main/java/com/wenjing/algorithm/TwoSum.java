package com.wenjing.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
//        int[] nums = new int[]{3, 1, 4, 1, 5};
        int[] nums = new int[]{2, 5, 5, 11};

        int target = 10;
        int[] indexes = twoSum(nums, target);
        for (int index : indexes) {
            System.out.println(index);
        }
    }

    // int nums = [3,2,4] //target = 6
    public static int[] twoSum(int[] nums, int target) {
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (firstIndex != 0 || secondIndex != 0) {
                return new int[]{firstIndex, secondIndex};
            }
            Map<Integer, Integer> hashMap = new HashMap<>();
            hashMap.put(i, nums[i]);
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                int current = nums[i1];
                System.out.println(i + " " + i1);
                if (hashMap.get(i) + current == target) {
                    firstIndex = i;
                    secondIndex = i1;
                    break;
                }
            }
        }
        return new int[]{firstIndex, secondIndex};
    }
}
