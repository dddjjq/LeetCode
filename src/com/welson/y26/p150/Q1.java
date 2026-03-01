package com.welson.y26.p150;

import java.util.Arrays;

public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int[] origin = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return getIndex(nums[start], nums[end], origin);
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{0, 0};
    }

    private int[] getIndex(int begin, int end, int[] nums) {
        int beginIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == begin && beginIndex == -1) {
                beginIndex = i;
            } else if (nums[i] == end && endIndex == -1) {
                endIndex = i;
            }
        }
        return new int[]{beginIndex, endIndex};
    }
}
