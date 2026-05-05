package com.welson.hot200_1;

public class Q167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            while (l < r && numbers[l] == numbers[l + 1]) {
                l++;
            }
            while (r >= 0 && numbers[r] == numbers[r - 1]) {
                r++;
            }
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            } else if (sum > target) {
                r--;
            } else  {
                l++;
            }
        }
        return new int[2];
    }
}
