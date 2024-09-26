package com.wenjing.algorithm;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = new String[]{"ab", "a"};
        longestCommonPrefix(strings);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String shortestStr = null;
        for (String str : strs) {
            if (shortestStr == null) {
                shortestStr = str;
            } else {
                if (shortestStr.length() > str.length()) {
                    shortestStr = str;
                }
            }
        }
        String longestPrefix = "";
        boolean hasPrefix = true;
        String prefix;
        for (int i = 0; i < shortestStr.length(); i++) {
            prefix = shortestStr.substring(0, i + 1);
            for (String str : strs) {
                if (!str.substring(0, i + 1).equals(prefix)) {
                    hasPrefix = false;
                }
            }
            if (hasPrefix) {
                longestPrefix = prefix;
            } else {
                return longestPrefix;
            }
        }
        return longestPrefix;
    }
}
