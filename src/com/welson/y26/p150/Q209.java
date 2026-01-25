package com.welson.y26.p150;

public class Q209 {
    public int minSubArrayLen(int target, int[] nums) {
        int right = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                len = Math.min(len, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if (len == Integer.MAX_VALUE) {
            return 0;
        }
        return len;
    }
}
