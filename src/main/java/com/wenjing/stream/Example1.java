package com.wenjing.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        filter();
    }

    public static void filter() {
        ArrayList<String> list = new ArrayList();
        list.add("hello world");
        list.add("hello UK");
        list.add("hello Ireland");
        list.add("Good morning, US");
        list.add("Good morning, CN");
        List<String> strings = list.stream().filter(p -> p.contains("morning"))
                .collect(Collectors.toList());
        System.out.println(strings);

    }
}
