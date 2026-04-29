package com.welson.hot200_1;

public class Q26 {
    public int removeDuplicates(int[] nums) {
        int last = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != last) {
                nums[index] = nums[i];
                index++;
            }
            last = nums[i];
        }
        return index;
    }
}
