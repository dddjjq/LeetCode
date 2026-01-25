package com.welson.y26.p150;

public class Q80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int cur = nums[0];
        int size = 1;
        int cal = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != cur) {
                cur = nums[i];
                nums[size] = nums[i];
                size++;
                cal = 1;
            } else if (cal < 2){
                cur = nums[i];
                nums[size] = nums[i];
                size++;
                cal++;
            }
        }
        return size;
    }
}
