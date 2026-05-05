package com.welson.hot200_1;

public class Q1493 {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int cnt0 = 0;
        int ans = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                cnt0++;
            }
            while (cnt0 > 1) {
                if (nums[l] == 0) {
                    cnt0--;
                }
                l++;
            }
            ans = Math.max(r - l, ans);
            r++;
        }
        return ans;
    }
}
