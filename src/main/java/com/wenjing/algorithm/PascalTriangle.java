package com.wenjing.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        generate(5);
    }

    //    [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 1) {
            list.add(Arrays.asList(1));
            return list;
        }
        if (numRows >= 2) {
            list.add(Arrays.asList(1));
            list.add(Arrays.asList(1, 1));
        }

        for (int i = 2; i < numRows; i++) {
            int[] temp = new int[i + 1];
            temp[0] = 1; // first element
            temp[temp.length - 1] = 1; //last element

            List<Integer> ints = list.get(list.size() - 1);
            for (int i1 = 0; i1 < ints.size() - 1; i1++) {
                int current = ints.get(i1) + ints.get(i1 + 1);
                temp[i1 + 1] = current;
            }
            List<Integer> tempList = new ArrayList<>();
            for (int i1 : temp) {
                tempList.add(i1);
            }
            list.add(tempList);
        }
        return list;
    }
}
