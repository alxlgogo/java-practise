package com.wenjing.string;

import java.util.Locale;

public class StringCommonFunctions {
    public static void main(String[] args) {
        String str = "hello";
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        System.out.println(lowerCase);
        char chs = 65;
        System.out.println(chs);


        char[] chars = str.toCharArray();
        for (char ch:chars){
//            System.out.println(ch);
        }
//        System.out.println(chars);

    }
}
