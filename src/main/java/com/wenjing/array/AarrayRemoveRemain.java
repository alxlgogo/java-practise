package com.wenjing.array;

import java.util.ArrayList;

public class AarrayRemoveRemain {
    public static void main(String[] args) {
        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);

//        arr1.removeAll(arr2);
//        System.out.println("Remove all : " + arr1);

        arr1.retainAll(arr2);
        System.out.println("Retain all :" + arr1);

    }
}
