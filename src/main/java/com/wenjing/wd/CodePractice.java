package com.wenjing.wd;

import java.util.*;

class CodePractice {
    public static void main(String args[]) {
//        String srcString = "Hello";
//        String reverseString = reverseString(srcString);
//        System.out.println(reverseString);
//
//        int[] nums = {0, 1, 2, 4, 6, 10};
//        List<Integer> missNumbers = findMissNumbers(nums);
//        System.out.println(missNumbers);
//
//        String message1 = "AB1BA";
//        String message2 = "ADBA";
//        boolean isPalindrome = isPalindromeString(message1);
//        System.out.println(isPalindrome);
//
//        int[] nums2 = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3};
//
//        List<Integer> duplicateElements = findDuplicateElements(nums2);

        findPrime();
    }


    static List<Integer> findDuplicateElements(int[] nums) {
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


    private static boolean isPalindromeString(String message1) {
        int length = message1.length();

        // AB C BA
        // AB BA
        int leftBoundary = length / 2;
        int rightBoundary = (length % 2 != 0 ? length / 2 + 1 : length / 2);

        String leftMessage = message1.substring(0, leftBoundary);
        String rightMessage = message1.substring(rightBoundary);
        String rightReverseString = reverseString(rightMessage);

        if (leftMessage.equals(rightReverseString)) {
            return true;
        }
        return false;
    }

    public static String reverseString(String srcString) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = srcString.toCharArray();
        int length = chars.length;
        while (length > 0) {
            char aChar = chars[length - 1];
            stringBuffer.append(aChar);
            length--;
        }
        return stringBuffer.toString();
    }

    public static List<Integer> findMissNumbers(int[] nums) {
        Arrays.sort(nums);
        int maxNumber = nums[nums.length - 1];
        List<Integer> missNumbers = new ArrayList<>();
        for (int i = 0; i < maxNumber; i++) {
            boolean findAny = false;
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (i == nums[i1]) {
                    findAny = true;
                }
            }
            if (!findAny) {
                missNumbers.add(i);
            }
        }
        return missNumbers;
    }


    public static String findTheLongestString(String[] strArray) {
//        String[] strs = {"flower", "flow", "flight"};
        String maxString = "";
        for (String str : strArray) {
            if (!maxString.equals(str) && maxString.length() < str.length()) {
                maxString = str;
            }
        }
        return maxString;
    }

    public static int countWordsNumber(String sentence) {
//        String sentence = "This is a sample sentence to count words";
        String[] split = sentence.split(" ");
        return split.length;
    }

    public static void findPrime() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19);
        for (Integer number : numbers) {
            if (number == 1) {
                continue;
            }
            if (number == 2 || number == 3 || number == 5) {
                System.out.println(String.format("Prime number: %s", number));
            }
            if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
                continue;
            } else {
                System.out.println(String.format("Prime number: %s", number));
            }
        }
    }

}


