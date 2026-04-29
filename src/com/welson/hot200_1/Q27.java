package com.welson.hot200_1;

public class Q27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int last = nums.length - 1;
        while (last > 0 && last < nums.length && nums[last] == val) {
            last--;
        }

        for (int i = 0; i <= last; i++) {
            if (nums[i] == val) {
                nums[i] = nums[last];
                last--;
                while (last > 0 && last < nums.length && nums[last] == val) {
                    last--;
                }
            }
        }
        return last + 1;
    }
}
