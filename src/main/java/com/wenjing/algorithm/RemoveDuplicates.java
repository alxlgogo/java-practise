package com.wenjing.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    public static int[] removeDuplicates2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] newArr = new int[set.size()];
        for (int i = 0; i < set.size(); i++) {
            newArr[i] = i;
        }
        return newArr;
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                temp = nums[i];
                list.add(temp);
            } else {
                int current = nums[i];
                if (current == temp) {
                    count++;
                } else {
                    temp = current;
                    list.add(temp);
                }
            }
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return nums.length - count;
    }
}
