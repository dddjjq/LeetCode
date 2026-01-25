package com.welson.y26.p150;

public class Q189 {
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        int realK = k % nums.length;
        int[] temp = new int[realK];
        int j = 0;
        for (int i = nums.length - realK; i < nums.length; i++) {
            temp[j] = nums[i];
            j++;
        }
        for (int i = nums.length - realK - 1; i >= 0; i--) {
            nums[i + realK] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }

    public void rotateOneStep(int[] nums) {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = last;
    }
}
