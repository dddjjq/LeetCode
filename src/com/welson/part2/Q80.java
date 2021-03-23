package com.welson.part2;

/**
 * 80. 删除排序数组中的重复项 II
 */
public class Q80 {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 1;
        int len = nums.length;
        int count = 0;
        while (end < len) {
            if (nums[end] == nums[start]) {
                count++;
                if (count < 2) {
                    start++;
                    swap(nums,start,end);
                }
            } else {
                count = 0;
                start++;
                swap(nums, start, end);
            }
            end++;
        }
        return start + 1;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
