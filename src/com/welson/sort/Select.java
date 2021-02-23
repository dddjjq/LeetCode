package com.welson.sort;

public class Select implements ISort {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int current = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    current = j;
                    min = arr[j];
                }
            }
            swap(arr,current,i);
        }
    }
}
