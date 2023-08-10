package com.hillel.homework15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 7, 10, 12, 2};
        System.out.println("BEFORE:");
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("AFTER:");
        System.out.println(Arrays.toString(arr));

        int[] array = {22, 44, 13, 57, 10, 12, 2};
        System.out.println("BEFORE:");
        System.out.println(Arrays.toString(array));
        cocktailSort(array);
        System.out.println("AFTER:");
        System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int pivot = partition(arr, left,right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int point = left - 1;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                point++;
                swap(point, i , arr);
            }
        }
        swap(point + 1, right, arr);
        return point + 1;
    }

    private static void swap(int point, int i, int[] arr) {
        int temp = arr[point];
        arr[point] = arr[i];
        arr[i] = temp;
    }

    public static void cocktailSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
            swapped = false;

            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
