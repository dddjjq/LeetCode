package com.welson.hot200_1;

public class Q11 {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int ans = 0;
        while (start < end) {
            ans = Math.max(ans, Math.min(height[start], height[end]) * (end - start));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
}
