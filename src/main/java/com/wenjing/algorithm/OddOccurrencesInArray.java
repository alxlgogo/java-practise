package com.wenjing.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OddOccurrencesInArray {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        int singleNumber = 0;
        if(A.length==0){
            return singleNumber;
        }
        if(A.length==1){
            return A[0];
        }

        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int var : A) {
            if (hashMap.containsKey(var)) {
                int number = (int) hashMap.get(var);
                number++;
                hashMap.put(var, number);
            } else {
                hashMap.put(var, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> var : entries) {
            Integer value = var.getValue();
            if (value%2 > 1) {
                singleNumber = var.getKey();
            }
        }
        return singleNumber;
    }
}
