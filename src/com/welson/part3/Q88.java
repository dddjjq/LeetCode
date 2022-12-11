package com.welson.part3;

public class Q88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = nums1.length;
        int[] temps = new int[length];
        int index1 = 0;
        int index2 = 0;
        if (n == 0) {
            return;
        }
        while (index1 + index2 < length) {
            if (index2 >= n || index1 < m && nums1[index1] < nums2[index2]) {
                temps[index1 + index2] = nums1[index1];
                index1++;
            } else {
                temps[index1 + index2] = nums2[index2];
                index2++;
            }
        }
        System.arraycopy(temps, 0, nums1, 0, temps.length);
    }
}
