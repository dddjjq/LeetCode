package com.welson.part3;

public class Q1764 {

    public boolean canChoose(int[][] groups, int[] nums) {
        int n = groups.length;
        int length = nums.length;
        int lastIndex = 0;
        for (int[] sub : groups) {
            int tempL = sub.length;
            int tempIndex = 0;
            int lastMark = lastIndex;
            for (int i = lastIndex; i < length && tempIndex < tempL; i++) {
                if (sub[tempIndex] == nums[i]) {
                    if (tempIndex == 0) {
                        lastMark = lastIndex;
                    }
                    tempIndex++;
                } else {
                    tempIndex = 0;
                    lastIndex = lastMark;
                    i = lastMark;
                    lastMark++;
                }
                lastIndex++;
            }
            if (tempIndex != tempL) {
                return false;
            }
        }
        return true;
    }


}
