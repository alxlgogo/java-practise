package com.wenjing.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[([]])";
        isValid(s);
    }

    public static boolean isValid(String s) {
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            strs.add(s.substring(i, i + 1));
        }
        long leftP = strs.stream().filter(e -> e.equals("(")).count();
        long rightP = strs.stream().filter(e -> e.equals(")")).count();
        long leftB = strs.stream().filter(e -> e.equals("[")).count();
        long rightB = strs.stream().filter(e -> e.equals("]")).count();
        long leftT = strs.stream().filter(e -> e.equals("{")).count();
        long rightT = strs.stream().filter(e -> e.equals("}")).count();
        if (leftP != rightP || leftB != rightB || leftT != rightT) {
            return false;
        }

        List<String> strings = new ArrayList<>();
        for (String str : strs) {
            switch (str) {
                case "(":
                    strings.add("(");
                    break;
                case "[":
                    strings.add("[");
                    break;
                case "{":
                    strings.add("{");
                    break;
                case ")":
                    if (strings.size() == 0) {
                        return false;
                    }
                    String substring = strings.get(strings.size() - 1);
                    if (substring.equals("(")) {
                        strings.remove(strings.size() - 1);
                    } else {
                        return false;
                    }
                    break;
                case "]":
                    if (strings.size() == 0) {
                        return false;
                    }
                    String substring2 = strings.get(strings.size() - 1);
                    if (substring2.equals("[")) {
                        strings.remove(strings.size() - 1);

                    } else {
                        return false;
                    }
                    break;
                case "}":
                    if (strings.size() == 0) {
                        return false;
                    }
                    String substring3 = strings.get(strings.size() - 1);
                    if (substring3.equals("{")) {
                        strings.remove(strings.size() - 1);
                    } else {
                        return false;
                    }
                    break;
            }

        }
        return strings.size() == 0;
    }
}
