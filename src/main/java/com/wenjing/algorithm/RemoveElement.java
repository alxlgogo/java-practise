package com.wenjing.algorithm;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int count = removeElement(nums, val);
        System.out.println(count);
    }

    public static int removeElement(int[] nums, int val) {
        int[] newNums = new int[nums.length];
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                newNums[index] = nums[i];
                index++;
            }
        }
        int[] newNums1 = new int[index];
        System.arraycopy(newNums, 0, newNums1, 0, index);
        return nums.length - count;
    }
}
