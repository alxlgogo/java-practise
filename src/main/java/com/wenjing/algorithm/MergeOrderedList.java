package com.wenjing.algorithm;

public class MergeOrderedList {
    public static void main(String[] args) {
//        List<Integer> list1 = Arrays.asList(1, 6, 3, 2, 9);
//        List<Integer> list2 = Arrays.asList(2, 5, 5, 2, 12);
//        List<Integer> totalList = new ArrayList<>();
//        totalList.addAll(list1);
//        totalList.addAll(list2);
//        System.out.println(totalList);
//        Collections.sort(totalList, Comparator.comparingInt(e -> e));
//        System.out.println(totalList);

        //1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
//        int[] nums2 = {};
        int n = 3;
        merge(nums1, m, nums2, n);


        //2
        int[] list1 = {1, 3, 5, 7};
        int[] list2 = {2, 4, 6, 8, 10};
        int[] mergedList = mergeOrderedLists(list1, list2);
    }

    private static int[] mergeOrderedLists(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) {
                mergedList[index] = list1[i];
                index++;
                i++;
            } else {
                mergedList[index] = list2[j];
                index++;
                j++;
            }

        }
        while (i < list1.length) {
            mergedList[index] = list1[i];
            index++;
            i++;
        }
        while (j < list2.length) {
            mergedList[index] = list2[j];
            index++;
            j++;
        }

        return mergedList;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newNums = new int[m + n];
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                newNums[index] = nums1[i];
                index++;
                i++;
            } else {
                newNums[index] = nums2[j];
                index++;
                j++;
            }
        }

        while(i<m){
            newNums[index] = nums1[i];
            index++;
            i++;
        }
        while(j<n){
            newNums[index] = nums2[j];
            index++;
            j++;
        }

        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}

