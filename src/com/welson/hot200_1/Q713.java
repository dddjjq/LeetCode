package com.welson.hot200_1;

public class Q713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;
        int r = 0;
        long product = 1;
        int ans = 0;
        for (; r < nums.length; r++) {
            product *= nums[r];
            while (product >= k && l <= r) {
                product /= nums[l];
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }

}
