package com.example.algorithm;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6};

        System.out.println(findMaxIndex(arr)); // 3
        System.out.println(findMaxValue(arr)); // 6
    }

    private static int findMaxIndex(int[] arr) {
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int findMaxValue(int[] arr) {
        return arr[findMaxIndex(arr)];
    }
}
