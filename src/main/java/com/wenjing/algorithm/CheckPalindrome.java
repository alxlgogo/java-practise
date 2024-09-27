package com.wenjing.algorithm;

public class CheckPalindrome {
    public static void main(String[] args) {
        String srcString = "racecar1";
        boolean check = check(srcString);
        System.out.println(check);
    }

    public static boolean check(String srcString) {
        int leftPointer = 0;
        int rightPointer = srcString.length() - 1;

        char[] chars = srcString.toCharArray();
        while (leftPointer < rightPointer) {

            if (chars[leftPointer] != chars[rightPointer]) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    public static boolean checkInt(int x) {
        String xStr = x + "";
        char[] chars = xStr.toCharArray();
        int leftPointer = 0;
        int rightPointer = xStr.length() - 1;

        while (leftPointer < rightPointer) {
            if (chars[leftPointer] != chars[rightPointer]) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
