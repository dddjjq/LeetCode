package com.welson.part2;

import java.util.Arrays;

/**
 * 80. 删除排序数组中的重复项 II
 */
public class Q80 {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 0;
        int len = nums.length;
        int count = 0;
        while (end < len) {
            if (nums[end] == nums[start]) {
                end++;
                count++;
                if (count == 2) {
                    swap(nums, start, end);
                } else {
                    start++;
                }
            } else {
                start++;
                count = 1;
                end++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return start + 1;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
