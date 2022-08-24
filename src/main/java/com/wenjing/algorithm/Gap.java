package com.wenjing.algorithm;

public class Gap {
    public static void main(String[] args) {
        int N = 1041;
        solution(N);
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        String binaryString = Integer.toBinaryString(N);
        int index = binaryString.indexOf("1");
        int lastIndexOf = binaryString.lastIndexOf("1");
        if (index == lastIndexOf) {
            return 0;
        }
        String[] strings = binaryString.split("1");
        int maxLenth = 0;
        if (lastIndexOf != binaryString.length() - 1) {
            for (int i = 0; i < strings.length - 1; i++) {
                if (strings[i].length() > maxLenth) {
                    maxLenth = strings[i].length();
                }
            }
        }else {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() > maxLenth) {
                    maxLenth = strings[i].length();
                }
            }
        }
        return maxLenth;
    }
}
