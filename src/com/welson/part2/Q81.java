package com.welson.part2;

/**
 * 80.搜索旋转排序数组 II
 */
public class Q81 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[start] > nums[mid]) {
                if (nums[start] < target) {
                    start = mid + 1;
                } else if (nums[start] > target) {
                    end = mid;
                } else {
                    return true;
                }
            } else if (nums[start] < nums[mid]) {
                if (nums[start] > target) {
                    start = mid;
                } else if (nums[start] < target) {
                    end = mid;
                } else {
                    return true;
                }
            } else {
                if (nums[start] == target) {
                    return true;
                }
                start++;
            }
        }
        return false;
    }
}
