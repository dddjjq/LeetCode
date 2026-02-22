package com.welson.y26.p150;

public class Q238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return nums;
        }
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n - 1] = nums[n - 1];
        int[] res = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }
        res[0] = suffix[1];
        res[n - 1] = prefix[n - 2];
        for (int i = 1; i < n - 1; i++) {
            res[i] = prefix[i - 1] * suffix[i + 1];
        }
        return res;
    }
}
