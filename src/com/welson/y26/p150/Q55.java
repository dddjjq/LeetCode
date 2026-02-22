package com.welson.y26.p150;

public class Q55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int pre =0;
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(pre - 1, nums[i-1] - 1);
            if (res < 0) {
                return false;
            }
            pre = res;
        }
        return true;
    }
}
