package com.welson.perday;

public class Q3640 {
    public long maxSumTrionic(int[] nums) {
        int ret = Integer.MIN_VALUE;
        int i = 0;
        int pre = Integer.MIN_VALUE;
        while (i < nums.length) {
            //1.
            if (nums[i] > pre) {
                pre  = nums[i];
                continue;
            }

            //2.

            i++;
        }
        return 0;
    }
}
