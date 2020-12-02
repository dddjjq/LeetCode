package com.welson;

/**
 * 4. 寻找两个正序数组的中位数
 */
public class Q4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] target = new int[nums1.length + nums2.length];
        int ptr1 = 0;
        int ptr2 = 0;
        for (int i = 0; i < target.length; i++) {
            if (ptr1 < nums1.length) {
                if (ptr2 < nums2.length) {
                    if (nums1[ptr1] < nums2[ptr2]) {
                        target[i] = nums1[ptr1];
                        ptr1++;
                    } else {
                        target[i] = nums2[ptr2];
                        ptr2++;
                    }
                } else {
                    target[i] = nums1[ptr1];
                    ptr1++;
                }
            } else {
                target[i] = nums2[ptr2];
                ptr2++;
            }
        }
        if (target.length % 2 == 0) {
            return (target[target.length / 2 - 1] + target[target.length / 2]) * 1.0f / 2;
        } else {
            return target[target.length / 2];
        }
    }
}
