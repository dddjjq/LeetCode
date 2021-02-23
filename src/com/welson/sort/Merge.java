package com.welson.sort;

public class Merge implements ISort {
    @Override
    public void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
    }

    public void mergeSort(int[] arr, int start, int end, int[] temp) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid, temp);
            mergeSort(arr, mid + 1, end, temp);
            merge(arr,start,mid,end,temp);
        }
    }

    public void merge(int[] arr, int start, int mid, int end, int[] temp) {
        int i = start;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= end) {
            if (arr[j] > arr[i]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= end) {
            temp[t++] = arr[j++];
        }
        t = 0;
        while (start <= end) {
            arr[start++] = temp[t++];
        }
    }
}
