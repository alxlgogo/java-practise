package com.wenjing.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        containAndRemove();
        isEmpty();
        putAll();
        replace();
    }

    public static void replace() {
        System.out.println("-------------------------------");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "001");
        hashMap.put("2", "002");
        hashMap.put("3", "003");
        hashMap.replace("1", "R001");
        System.out.println(hashMap);
    }

    public static void putAll() {
        System.out.println("-------------------------------");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "001");
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("2", "002");
        hashMap2.put("3", "003");
        hashMap.putAll(hashMap2);
        System.out.println(hashMap);
        System.out.println();
    }

    public static void isEmpty() {
        System.out.println("-------------------------------");
        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println(hashMap.isEmpty());
    }

    public static void containAndRemove() {
        System.out.println("-------------------------------");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "001");
        hashMap.put("2", "002");
        hashMap.put("3", "003");

        if (hashMap.containsKey("2")) {
            hashMap.remove("2");
        }

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> map : entries) {
            System.out.println(map.getKey() + "----" + map.getValue());
        }
    }


}
