package com.welson.part2;

public class Q75 {
    public void sortColors(int[] nums) {
        int zNum = 0, oNum = 0, tNum = 0;
        for (int num : nums) {
            if (num == 0) {
                zNum++;
            } else if (num == 1) {
                oNum++;
            } else if (num == 2) {
                tNum++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zNum > 0) {
                nums[i] = 0;
                zNum--;
                continue;
            }
            if (oNum > 0) {
                nums[i] = 1;
                oNum--;
                continue;
            }
            if (tNum > 0) {
                nums[i] = 2;
                tNum--;
            }
        }
    }
}
