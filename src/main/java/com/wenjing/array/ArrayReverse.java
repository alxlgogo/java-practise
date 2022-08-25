package com.wenjing.array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverse1(arr, arr.length);
    }

    /**
     * reverse:
     * Define a new array
     * The first element of new array is the last element of the old array.
     * Every loop, the index of old array current index is incremented by 1,
     * the current index of new array index is decremented by 1.
     * <p>
     * int j = length
     * newArr[j-1] = oldArr[i];
     * j--
     */
    public static void reverse1(int[] arr, int length) {
        int[] arr1 = new int[length];
        int j = length;
        for (int i = 0; i < length; i++) {
            arr1[j - 1] = arr[i];
            j--;
        }

        for (int pre : arr1) {
            System.out.println(pre);
        }
    }


    /**
     *
     */
    public static void reverse2(int[] arr, int length) {
        int temp;
        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        for (int pre : arr) {
            System.out.println(pre);
        }
    }
}
