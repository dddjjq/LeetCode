package com.welson.part3;

public class Q1752 {
    public boolean check(int[] nums) {
        if (nums.length == 0) {
            return true;
        }
        int max = nums[0];
        int beforeMin = nums[0];
        int splitIndex = -1;
        //find the split index
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < max) {
                splitIndex = i;
                break;
            } else {
                max = nums[i];
            }
        }
        if (splitIndex == -1) {
            return true;
        }
        //judge end half validation
        int afterMax = nums[splitIndex];
        for (int i = splitIndex; i < nums.length; i++) {
            if (nums[i] >= afterMax) {
                afterMax = nums[i];
            } else {
                return false;
            }
            if (afterMax > beforeMin) {
                return false;
            }
        }
        return true;
    }
}
