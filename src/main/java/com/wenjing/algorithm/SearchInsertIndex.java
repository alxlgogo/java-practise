package com.wenjing.algorithm;

public class SearchInsertIndex {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 6};
        int target = 5;
        searchInsert(nums, target);
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
