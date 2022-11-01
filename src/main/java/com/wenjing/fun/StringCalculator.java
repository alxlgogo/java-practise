package com.wenjing.fun;

import java.util.ArrayList;

public class StringCalculator {
    public static void main(String[] args) {
        String[] strArray = {"5", "2", "c", "d", "+"};
        int number = calculate(strArray);
        System.out.println(number);
    }

    public static int calculate(String[] strArray) {
        ArrayList<String> list = new ArrayList<>();
        for (String arr : strArray) {
            switch (arr) {
                case "c":
                    list.remove(list.size() - 1);
                    break;
                case "d":
                    String lastOneString = list.get(list.size() - 1);
                    int lastOneNumber = Integer.parseInt(lastOneString);
                    int doubleLastOneNumber = lastOneNumber * 2;
                    list.add(String.valueOf(doubleLastOneNumber));
                    break;
                case "+":
                    String lastOneString1;
                    int lastOneNumber1 = 0;
                    String lastTwoString1;
                    int lastTwoNumber1 = 0;

                    if (list.size() == 1) {
                        lastOneString1 = list.get(list.size() - 1);
                        lastOneNumber1 = Integer.parseInt(lastOneString1);
                    } else if (list.size() == 0) {

                    } else {
                        lastOneString1 = list.get(list.size() - 1);
                        lastOneNumber1 = Integer.parseInt(lastOneString1);
                        lastTwoString1 = list.get(list.size() - 2);
                        lastTwoNumber1 = Integer.parseInt(lastTwoString1);
                    }
                    int totalNumber = lastOneNumber1 + lastTwoNumber1;
                    list.add(totalNumber + "");
                    break;
                default:
                    list.add(arr);
                    break;
            }
        }

        int totalNumber = 0;
        for (String arr : list) {
            totalNumber = totalNumber + Integer.parseInt(arr);
        }
        return totalNumber;
    }
}
