package com.welson.y26.p150;

public class Q153 {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            ans = Math.min(nums[mid], ans);
        }
        return ans;
    }

}
