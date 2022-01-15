package com.example.algorithm;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6};

        System.out.println(findMinValue(arr)); // 3
        System.out.println(findMinIndex(arr)); // 2
    }

    private static int findMinValue(int[] arr) {
        return arr[findMinIndex(arr)];
    }

    private static int findMinIndex(int[] arr) {
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
