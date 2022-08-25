package com.wenjing.string;

public class SearchlastString {
    public static void main(String[] args) {
        String str = "https://www.google.net.google.net/";
        int firstIndex = str.indexOf("o");
        int lastIndexOf = str.lastIndexOf("o");
        System.out.println(firstIndex);
        System.out.println(lastIndexOf);

        //from specific find the first one.
        int index = str.indexOf("t", 2);
        System.out.println(index);

        //from specific find the first one.
        int index2 = str.lastIndexOf("t", 2);

    }
}
