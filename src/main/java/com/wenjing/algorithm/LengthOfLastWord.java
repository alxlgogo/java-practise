package com.wenjing.algorithm;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String message = " a";
        int length = length(message);
        System.out.println(length);
    }

    private static int length(String message) {
        if (!message.isEmpty()) {
            String trimMessage = message.trim();
            if (trimMessage.contains(" ")) {
                String substring = trimMessage.substring(trimMessage.lastIndexOf(" ")).trim();
                return substring.length();
            } else {
                return trimMessage.length();
            }
        } else {
            return 0;
        }
    }
}
