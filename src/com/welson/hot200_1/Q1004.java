package com.welson.hot200_1;


public class Q1004 {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int ans = 0;
        int cnt0 = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                cnt0++;
            }
            while (cnt0 > k) {
                if (nums[l] == 0) {
                    cnt0--;
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}
