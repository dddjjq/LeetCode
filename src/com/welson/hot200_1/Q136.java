package com.welson.hot200_1;

public class Q136 {
    public int singleNumber(int[] nums) {
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
