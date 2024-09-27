package com.wenjing.algorithm;

public class ReverseString {
    public static void main(String[] args) {
        String srcString = "ABC";
        String reverse = reverse(srcString);
        System.out.println(reverse);
        System.out.println(1/2);

        String reverse2 = reverse2(srcString);
        System.out.println(reverse2);

    }

    public static String reverse(String srcString) {
        StringBuffer sb = new StringBuffer();
        for (int length = srcString.length(); length > 0; length--) {
            String substring = srcString.substring(length - 1, length);
            sb.append(substring);
            System.out.println(substring);
        }
        return sb.toString();
    }

    public static String reverse2(String srcString) {
        int left = 0;
        int right = srcString.length() - 1;
        char[] chars = srcString.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
