package com.wenjing.string;

public class RemoveCharAt {
    public static void main(String[] args) {
        String str = "how are you";
        String replace = str.replace("h", "H");
        System.out.println(replace);

        String removeCharAt = removeCharAt(str, 0);
        System.out.println(removeCharAt);

    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
