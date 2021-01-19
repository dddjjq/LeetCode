package com.welson.part1;

public class Q31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        for (; i >= 0 && nums[i + 1] <= nums[i]; i--) ;
        if (i >= 0) {
            int j = nums.length - 1;
            for (; j >= 0 && nums[j] <= nums[i]; j--) ;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    public void swap(int[] nums, int p, int q) {
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }

}
