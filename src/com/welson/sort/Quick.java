package com.welson.sort;

import java.util.Arrays;

public class Quick implements ISort {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int i = partition(arr, left, right);
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
}
