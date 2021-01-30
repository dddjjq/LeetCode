package com.welson.part2;

public class Q53 {
    public int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int length = nums.length;
        int pre = nums[0];
        int result = pre;
        for (int i = 1; i < length; i++) {
            int temp = Math.max(nums[i], nums[i] + pre);
            pre = temp;
            result = Math.max(result, temp);
        }
        return result;
    }
}
