package com.example.algorithm;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 3, 6};
        int[] arr2 = {4, 5, 3, 6};

        int[] ascSortArr = sortAscending(arr1);
        int[] descSortArr = sortDescending(arr2);

        System.out.println(" ==== Ascending Array ==== ");
        printArr(ascSortArr);
        System.out.println();
        System.out.println(" ==== Descending Array ==== ");
        printArr(descSortArr);
    }

    private static void printArr(int[] sortArr) {
        for(int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);
        }
    }

    private static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            if (min_idx != i) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    private static int[] sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
            }

            if (max_idx != i) {
                int temp = arr[max_idx];
                arr[max_idx] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
 }
