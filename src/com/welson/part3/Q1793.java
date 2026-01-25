package com.welson.part3;

public class Q1793 {

    public int maximumScore(int[] nums, int k) {
        int len = nums.length;
        if (k < 0 || k > len) {
            return -1;
        }
        int left = k - 1;
        int right = k + 1;
        int result = nums[k];
        int num = nums[k];
        while (num > 0 && (left >= 0 || right < len)) {
            while (left >= 0 && nums[left] >= num) {
                left--;
            }
            while (right < len && nums[right] >= num) {
                right++;
            }
            result = Math.max(result, (right - left - 1) * num);
            int leftNum = left >= 0 ? nums[left] : -1;
            int rightNum = right < len ? nums[right] : -1;
            num = Math.max(leftNum, rightNum);
        }
        return result;
    }


    /**
     * 暴力解法 超时
     */
    /*public int maximumScore(int[] nums, int k) {
        int len = nums.length;
        if (k < 0 || k > len) {
            return -1;
        }
        int maxResult = 0;
        int[] minBefore = new int[k + 1];
        for (int i = k; i >= 0; i--) {
            if (i < k) {
                minBefore[i] = Math.min(nums[i], minBefore[i + 1]);
            } else {
                minBefore[i] = nums[i];
            }
        }
        for (int i = 0; i <= k; i++) {
            int min = minBefore[i];
            for (int j = k; j < len; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                }
                int result = (j - i + 1) * min;
                if (maxResult < result) {
                    maxResult = result;
                }
            }
        }
        return maxResult;
    }*/
}
