package com.welson.y26.p150;

public class Q45 {
    public int jump(int[] nums) {
        int n = nums.length;
        int step = 0;
        int maxPosition = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                step++;
            }
        }
        return step;
    }

    public int jump2(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = 1;
        int step = 0;
        while (end < n) {
            int maxPosition = 0;
            for (int i = start; i < end; i++) {
                maxPosition = Math.max(maxPosition, nums[i] + i);
            }
            start = end;
            end = maxPosition + 1;
            step++;
        }
        return step;
    }
}
