package com.welson.part2;

public class Q55 {
    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }
        if (nums.length == 1) {
            return nums[0] == 0;
        }
        int length = nums.length;
        int last = nums[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            int target = last - nums[i];
            if (i - target >= 0 && nums[i - target] == target) {
                return true;
            }
        }
        return false;
    }
}
