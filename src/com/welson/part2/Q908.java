package com.welson.part2;

public class Q908 {

    public static void main(String[] args) {
        Q908 q908 = new Q908();
        int[] nums = {0,10};
        int k = 2;
        System.out.println(q908.smallestRangeI(nums, k));
    }

    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (max <= num) {
                max = num;
            }
            if (min >= num) {
                min = num;
            }
        }
        int res = max - min - 2 * k;
        if (res < 0) {
            res = 0;
        }
        return res;
    }
}
