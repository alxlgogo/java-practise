package com.wenjing.string;

public class StringToByte {
    public static void main(String[] args) {
        String str = "abc";
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }
        String newStr = new String(bytes);
        System.out.println(newStr);
    }
}
