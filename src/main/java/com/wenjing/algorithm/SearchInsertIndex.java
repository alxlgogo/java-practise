package com.wenjing.algorithm;

public class SearchInsertIndex {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert2(nums, target));

    }

    public static int searchInsert2(int[] nums, int target) {
        if (nums[nums.length - 1] < target) {
            return nums.length - 1;
        }
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            // 1,3,5,6,  5
            if (nums[i] >= target) {
                return i;
            } else {
                index = i;
            }
        }
        return index + 1;
    }

    public static int searchInsert(int[] nums, int target) {
        int leftIndex = -1;
        int rightIndex = nums.length;
        int middle;
        while (leftIndex + 1 != rightIndex) {
            middle = (leftIndex + rightIndex) / 2;
            int num = nums[middle];
            if (num == target) {
                return middle;
            } else if (nums[middle] > 5) {
                rightIndex = middle;
            } else {
                leftIndex = middle;
            }
        }
        return 0;
    }
}
