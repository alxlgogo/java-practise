package com.wenjing.string;

public class Reverse {
    public static void main(String[] args) {
        isSymmetry("abba");
        isSymmetry("aba");
        isSymmetry("abcd");
        isSymmetry("abbba");
    }

    public static void isSymmetry(String str) {
        int length = str.length();
        String str1 = "";
        String str2 = "";
        StringBuilder sb = new StringBuilder();
        if (length % 2 == 0) {
            str1 = str.substring(0, length / 2);
            str2 = str.substring(length / 2, length);
        } else {
            str1 = str.substring(0, length / 2);
            str2 = str.substring(length / 2 + 1, length);
        }
        sb.append(str2);
        sb.reverse();
        boolean isSymmetry = str1.equals(sb.toString());
        System.out.println(isSymmetry);
    }
}
