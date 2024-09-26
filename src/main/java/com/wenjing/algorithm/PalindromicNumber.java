package com.wenjing.algorithm;

public class PalindromicNumber {
    public static void main(String[] args) {
        isPalindrome(1001);
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int middle;
        String left;
        String right;
        if (str.length() % 2 == 1) {
            middle = str.length() / 2;
            left = str.substring(0, middle);
            right = str.substring(middle + 1);
        } else {
            middle = str.length() / 2;
            left = str.substring(0, middle);
            right = str.substring(middle);
        }
        char[] chars = right.toCharArray();

        StringBuffer sb = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        right = sb.toString();
        return left.equals(right);
    }
}
