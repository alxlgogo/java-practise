package com.wenjing.algorithm;

public class CyclicRotation {
    public static void main(String[] args) {

//        int[] A = {3, 8, 9, 7, 6};
        int[] A = {1, 1, 2, 3, 5};
        int K = 42;
        solution(A, K);
    }

    public static int[] solution(int[] arr, int k) {
        if (arr.length <= 1) {
            return arr;
        }
        if (arr.length == k) {
            return arr;
        }
        int[] newArr = new int[arr.length];
        if (k > arr.length) {
            k = k % arr.length;
        }

        for (int i = 0; i < arr.length; i++) {
            int var = arr[i];
            int tempIndex = i + k;
            if (i + k >= arr.length) {
                tempIndex = i + k - arr.length;
            }
            newArr[tempIndex] = var;
        }
        return newArr;
    }
}


//  1 2   3
//  2 1
//  1 2
//  2 1