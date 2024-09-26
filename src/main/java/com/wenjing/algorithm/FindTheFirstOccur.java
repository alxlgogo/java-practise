package com.wenjing.algorithm;

public class FindTheFirstOccur {
    public static void main(String[] args) {

//        Input: haystack = "sadbutsad", needle = "sad"
        String haystack = "1sadbutsad";
        String needle = "sad";
        strStr(haystack, needle);
    }

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        int index = haystack.indexOf(needle);
        return index;
    }
}
