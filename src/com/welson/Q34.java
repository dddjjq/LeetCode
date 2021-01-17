package com.welson;

public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        if (start <= end && end < length && nums[start] == target && nums[end] == target) {
            return new int[]{start, end};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean isBegin) {
        int start = 0;
        int end = nums.length - 1;
        int result = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                result = mid;
            }
            if (nums[mid] > target || (isBegin && nums[mid] >= target)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public int binarySearch(int[] nums, int target, int begin, int end) {
        int length = end - begin;
        int mid = begin + length / 2;
        if (begin > end) {
            return -1;
        } else if (begin == end) {
            return nums[begin] == target ? begin : -1;
        }
        if (nums[mid] > target) {
            return binarySearch(nums, target, begin, mid - 1);
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, end);
        } else {
            int result = binarySearch(nums, target, begin, mid - 1);
            if (result == -1) {
                return mid;
            } else {
                return result;
            }
        }
    }

}
