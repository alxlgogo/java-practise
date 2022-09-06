package com.wenjing.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Matches {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("C");
        list.add("A");
        list.add("B");

        Collections.sort(list, Comparator.naturalOrder());
    }
}
