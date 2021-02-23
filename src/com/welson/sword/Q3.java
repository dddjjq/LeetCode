package com.welson.sword;

import java.util.*;

/**
 * 剑指 Offer 03. 数组中重复的数字
 */
public class Q3 {
    /*public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                return nums[i];
            }
        }
        return 0;
    }*/

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return 0;
    }
}
