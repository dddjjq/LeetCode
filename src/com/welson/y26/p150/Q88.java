package com.welson.y26.p150;

public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int index1 = 0;
        int index2 = 0;
        if (n == 0) {
            return;
        }
        for (int i = 0; i < nums1.length; i++) {
            if (index2 >= n || (index1 < m && nums1[index1] < nums2[index2])) {
                temp[i] = nums1[index1];
                index1++;
            } else {
                temp[i] = nums2[index2];
                index2++;
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = temp[i];
        }
    }
}
