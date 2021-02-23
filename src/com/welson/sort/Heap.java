package com.welson.sort;

public class Heap implements ISort {
    @Override
    public void sort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heavy(arr, arr.length, i);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heavy(arr,i,0);
        }
    }

    public void heavy(int[] arr, int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int large = i;
        if (left < n && arr[left] > arr[large]) {
            large = left;
        }
        if (right < n && arr[right] > arr[large]) {
            large = right;
        }
        if (large != i) {
            swap(arr, large, i);
            heavy(arr, n, large);
        }
    }
}
