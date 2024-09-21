package com.wenjing.array;

import java.util.*;

public class ArrayDuplicateElements {
    public static List<Integer> findDuplicateElements(int[] nums) {
        Set<Integer> duplicateElements = new HashSet<>();
        Arrays.sort(nums);
        int previousSibling = nums != null && nums.length > 0 ? nums[0] : 0;
        for (int i = 1; i < nums.length; i++) {
            if (previousSibling == nums[i]) {
                duplicateElements.add(nums[i]);
            } else {
                previousSibling = nums[i];
            }
        }
        return new ArrayList<>(duplicateElements);
    }
}
