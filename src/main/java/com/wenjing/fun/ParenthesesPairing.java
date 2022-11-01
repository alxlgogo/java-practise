package com.wenjing.fun;

import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

public class ParenthesesPairing {
    public static void main(String[] args) {
        String str = "[()([)]]";
        String valid = isValid(str);
        System.out.println(valid);
    }

    public static String isValid(String str) {
        String isValid = "inValid";
        char[] chars = str.toCharArray();
        Map<Character, Integer> oneMap = new HashMap<>();
        Map<Character, Integer> twoMap = new HashMap<>();
        Map<Character, Integer> threeMap = new HashMap<>();

        if (chars.length % 2 == 1)
            return isValid;
        CharBuffer.wrap(chars).chars().forEach(ch -> {
            if (ch == '(') {
                putIntoMap(oneMap, ch);
            } else if (ch == ')') {
                removeFromMap(oneMap, '(');
            } else if (ch == '[') {
                putIntoMap(twoMap, ch);
            } else if (ch == ']') {
                removeFromMap(twoMap, '[');
            } else if (ch == '{') {
                putIntoMap(threeMap, ch);
            } else if (ch == '}') {
                removeFromMap(threeMap, '{');
            }
        });

        Integer one = oneMap.get('(');
        Integer two = twoMap.get('[');
        Integer three = threeMap.get('{');

        Boolean isAllEmpty = false;
        if ((one == null || one == 0) && (two == null || two == 0) && (three == null || three == 0)) {
            isAllEmpty = true;
        }
        if (isAllEmpty)
            isValid = "valid";
        return isValid;
    }

    private static void removeFromMap(Map<Character, Integer> map, int ch) {
        if (map.get((char) ch) != null) {
            map.put((char) ch, map.get((char) ch) - 1);
        }
    }

    private static void putIntoMap(Map<Character, Integer> map, int ch) {
        if (map.get((char)ch) == null) {
            map.put((char) ch, 1);
        } else {
            map.put((char) ch, map.get((char)ch) + 1);
        }
    }
}
