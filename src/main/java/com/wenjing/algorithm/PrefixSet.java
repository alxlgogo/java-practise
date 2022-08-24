package com.wenjing.algorithm;

public class PrefixSet {
    public static void main(String[] args) {

    }

    public static int solution(int[] A) {
        int smallIndex = 0;
        int smallIntNumber = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < smallIntNumber) {
                smallIntNumber = A[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }
}
