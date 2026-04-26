package com.welson.y26.p150;

public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            if (nums[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }

    public int findLast(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid-1;
            } else {
                l = mid+1;
            }
            if (nums[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }
}
