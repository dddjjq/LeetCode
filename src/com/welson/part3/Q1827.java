package com.welson.part3;

public class Q1827 {

    public int minOperations(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 1) {
            return 0;
        }
        int max = nums[0];
        int count = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] <= max) {
                max = max + 1;
                count += max - nums[i];
            } else {
                max = nums[i];
            }
        }
        return count;
    }
}
