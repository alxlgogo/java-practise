package com.wenjing.string;

public class IsEmpty {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "hello";
        if (str1 == null || str2.isEmpty()) {
            System.out.println("String str1 is empty or null");
        } else {
            System.out.println(str1);
        }

        if (str2 == null || str2.isEmpty()) {
            System.out.println("String str2 is empty or null");
        } else {
            System.out.println(str2);
        }
    }
}
