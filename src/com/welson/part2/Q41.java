package com.welson.part2;

import java.util.Arrays;

public class Q41 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 1;
        }
        if (nums.length == 1) {
           if (nums[0] != 1) {
                return 1;
            } else {
                return 2;
            }
        }
        if (nums[0] > 1 || nums[nums.length - 1] < 0) {
            return 1;
        }
        int minPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] > 1) {
                minPos = Math.min(minPos, nums[i]);
            } else {
                minPos = 1;
            }
            if (nums[i] == minPos) {
                if (i != nums.length - 1 && nums[i] == nums[i + 1] - 1) {
                    minPos = nums[i + 1];
                } else if (i == nums.length - 1) {
                    minPos = nums[nums.length - 1];
                }
            }
        }
        return minPos + 1;
    }
}
