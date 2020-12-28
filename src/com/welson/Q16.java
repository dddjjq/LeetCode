package com.welson;

import java.util.Arrays;

public class Q16 {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int sub = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if (sub >= Math.abs(target - sum)) {
                    result = sum;
                    sub = Math.abs(target - sum);
                }
                if (sum == target) {
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;
                    end--;
                    start++;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
