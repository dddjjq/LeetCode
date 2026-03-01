package com.welson.y26.p150;

public class Q11 {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end) {
            int cur = Math.min(height[start], height[end]) * (end - start);
            max = Math.max(max, cur);
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }
}
