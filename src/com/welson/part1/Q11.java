package com.welson.part1;

/**
 * 11. 盛最多水的容器
 */
public class Q11 {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end){
            max = Math.max(max, (end - start) * Math.min(height[start], height[end]));
            if (height[start] > height[end]){
                end--;
            }else {
                start++;
            }
        }
        return max;
    }
}
