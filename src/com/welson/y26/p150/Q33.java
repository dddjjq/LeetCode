package com.welson.y26.p150;

public class Q33 {
    public int search(int[] nums, int target) {
        return helper(nums, 0, nums.length - 1, target);
    }

    public int helper(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] >= nums[left]) {
            if (target < nums[mid] && target >= nums[left]) {
                return helper(nums, left, mid - 1, target);
            }
            return helper(nums, mid + 1, right, target);
        } else {
            if (target > nums[mid] && target <= nums[right]) {
                return helper(nums, mid + 1, right, target);
            }
            return helper(nums, left, mid - 1, target);
        }
    }
}
