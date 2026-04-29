package com.welson.hot200_1;

public class Q724 {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
            } else {
                prefix[i] = prefix[i - 1] + nums[i];
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                suffix[i] = nums[i];
            } else {
                suffix[i] += suffix[i+ 1] + nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (prefix[i] == suffix[i]) {
                return i;
            }
        }
        return -1;
    }
}
