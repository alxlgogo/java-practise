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
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");

        String[] arr2 = new String[list.size()];
        list.toArray(arr2);
        for(String str :arr2){
            System.out.println(str);
        }

        System.out.println();
    }
}
