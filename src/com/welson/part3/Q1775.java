package com.welson.part3;

import java.util.Arrays;

public class Q1775 {
    /*public int minOperations(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i : nums1) {
            sum1 += i;
        }
        for (int i : nums2) {
            sum2 += i;
        }
        if (nums1.length > 6 * nums2.length
                || nums2.length > 6 * nums1.length) {
            return -1;
        }
        int count = 0;
        int index1 = 0;
        int index2 = 0;
        if (sum1 < sum2) {
            index2 = nums2.length - 1;
        } else {
            index1 = nums1.length - 1;
        }
        while (sum1 != sum2) {
            if (sum1 < sum2) {
                if (index1 >= nums1.length
                        || index2 < nums2.length
                        && (nums2[index2] - 1) > (6 - nums1[index1])) {
                    int min = Math.min(sum2 - sum1, nums2[index2] - 1);
                    sum1 += min;
                    index2--;
                } else {
                    int min = Math.min(sum2 - sum1, 6 - nums1[index1]);
                    sum1 += min;
                    index1++;
                }
            } else {
                if (index2 >= nums2.length
                        || index1 < nums1.length
                        && (nums1[index1] - 1) > (6 - nums2[index2])) {
                    int min = Math.min(sum1 - sum2, nums1[index1] - 1);
                    sum2 += min;
                    index1--;
                } else {
                    int min = Math.min(sum1 - sum2, 6 - nums2[index2]);
                    sum2 += min;
                    index2++;
                }
            }
            count++;
        }
        return count;
    }*/

    public int minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if (n > m * 6
                || m > n * 6) {
            return -1;
        }
        int[] cnt1 = new int[7];
        int[] cnt2 = new int[7];
        int diff = 0;
        for (int i : nums1) {
            cnt1[i]++;
            diff += i;
        }
        for (int i : nums2) {
            cnt2[i]++;
            diff -= i;
        }
        if (diff == 0) {
            return 0;
        }
        if (diff > 0) {
            return help(cnt2, cnt1, diff);
        }
        return help(cnt1, cnt2, diff);
    }

    public int help(int[] h1, int[] h2, int diff) {
        int[] h = new int[7];
        for (int i = 1; i < 7; i++) {
            h[6 - i] += h1[i];
            h[i - 1] += h2[i];
        }
        int res = 0;
        for (int i = 5; i > 0 && diff > 0; --i) {
            int t = Math.min((diff + i - 1) / i, h[i]);
            res += t;
            diff -= t * i;
        }
        return res;
    }
}
