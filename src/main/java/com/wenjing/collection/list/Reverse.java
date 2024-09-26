package com.wenjing.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        Collections.reverse(arr);
        System.out.println(arr);

        List<String> list = new ArrayList<String>();
        list.add("r");
        list.add("u");
        list.add("n");
        list.add("o");
        list.add("o");
        list.add("b");
        list.add("www.runoob.com");

        String[] arr2 = new String[list.size()];
        list.toArray(arr2);
        for(String str :arr2){
            System.out.println(str);
        }

        System.out.println();
    }
}
