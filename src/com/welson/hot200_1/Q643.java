package com.welson.hot200_1;

public class Q643 {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            return 0;
        }
        int l = 0;
        int r = k - 1;
        int sum = 0;
        double ans = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        ans = sum * 1.0 / k;
        while (r < nums.length-1) {
            sum -= nums[l];
            r++;
            l++;
            sum += nums[r];
            ans = Math.max(sum * 1.0 / k, ans);
        }
        return ans;
    }
}
