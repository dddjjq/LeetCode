package com.welson.y26.p150;

public class Q162 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        return innerFind(nums, 0, nums.length - 1);
    }

    public int innerFind(int[] nums, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (mid == 0) {
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
        } else if (mid == nums.length - 1) {
            if (nums[mid] > nums[mid - 1]) {
                return mid;
            }
            return -1;
        } else if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
            return mid;
        }
        int leftN = innerFind(nums, left, mid - 1);
        int rightN = innerFind(nums, mid + 1, right);
        if (leftN != -1) {
            return leftN;
        }
        return rightN;
    }
}
