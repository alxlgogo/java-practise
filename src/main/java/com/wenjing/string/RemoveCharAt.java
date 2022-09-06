package com.wenjing.string;

public class RemoveCharAt {
    public static void main(String[] args) {
//        String str = "how are you";
//        String replace = str.replace("h", "H");
//        System.out.println(replace);
//
//        String removeCharAt = removeCharAt(str, 0);
//        System.out.println(removeCharAt);

        charAt();
        contact();
        startsWith();

    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static void charAt() {
        String str = "abc";
        char ch = str.charAt(0);
        System.out.println(ch);
    }

    public static void contact() {
        String str1 = "abc";
        String str2 = "def";
        String concat = str1.concat(str2);
        System.out.println(concat);
    }   

    public static void startsWith() {
        String str1 = "hello world!";
        boolean hello = str1.startsWith("hello");
        //Start at offset, start with prefix.
        boolean world = str1.startsWith("llo", 2);
        System.out.println(hello);
        System.out.println(world);

    }
}
