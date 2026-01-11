package com.welson.y26.p150;

import java.util.Arrays;

public class Q27 {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int lastIndex = nums.length - 1;
        boolean hasFind = false;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (lastIndex >= 0 && nums[lastIndex] != val) {
                    nums[i] = nums[lastIndex];
                    lastIndex--;
                }
                hasFind = true;
                num++;
            } else if (hasFind) {
                break;
            }
        }
        return nums.length - num;
    }
}