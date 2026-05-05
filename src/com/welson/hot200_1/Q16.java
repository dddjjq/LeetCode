package com.welson.hot200_1;

import java.util.Arrays;

public class Q16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int delta = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int total = nums[i] + nums[l] + nums[r];
                int tmp = total - target;
                if (tmp > 0) {
                    r--;
                } else {
                    l++;
                }
                if (tmp == 0) {
                    return target;
                }
                if (Math.abs(tmp) < Math.abs(delta)) {
                    delta = tmp;
                }
            }
        }
        return target + delta;
    }
}
