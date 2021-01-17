package com.welson;

public class Q35 {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target);
    }

    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                result = mid;
                break;
            }
        }
        if (result == -1) {
            return start;
        }
        return result;
    }
}
