package com.welson.sword;

public class Q11 {
    public int minArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (numbers[mid] > numbers[end]) {
                start = mid + 1;
            } else if (numbers[mid] < numbers[end]) {
                end = mid;
            } else {
                end--;
            }
        }
        return numbers[start];
    }
}
