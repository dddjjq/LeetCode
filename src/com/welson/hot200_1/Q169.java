package com.welson.hot200_1;

public class Q169 {
    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int candidate = Integer.MIN_VALUE;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += candidate == num ? 1 : -1;
        }

        return candidate;
    }
}
