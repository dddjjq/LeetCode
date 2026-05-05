package com.welson.hot200_1;

public class Q977 {
    public int[] sortedSquares(int[] nums) {
        int split = findSplit(nums);
        int[] ans = new int[nums.length];
        int l = split - 1;
        int r = split;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (r >= nums.length || r < 0) {
                ans[index++] = nums[l] * nums[l];
                l--;
                continue;
            }
            if (l < 0 || l >= nums.length) {
                ans[index++] = nums[r] * nums[r];
                r++;
                continue;
            }
            if (nums[l] * nums[l] < nums[r] * nums[r]) {
                ans[index++] = nums[l] * nums[l];
                l--;
            } else {
                ans[index++] = nums[r] * nums[r];
                r++;
            }
        }
        return ans;
    }

    public int findSplit(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] >= 0) {
            return start;
        }
        if (nums[end] < 0) {
            return end + 1;
        }
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
