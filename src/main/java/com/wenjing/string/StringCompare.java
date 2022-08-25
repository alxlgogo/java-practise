package com.wenjing.string;

public class StringCompare {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        Object objStr = str1;
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareTo(objStr.toString()));
//        -32
//        0
//        0
    }
}
