package com.welson.y26.p150;

public class Q69 {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans = -1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public int mySqrt(int x, int left, int right) {
        int mid = left + (right - left) / 2;
        if (left >= right) {
            return mid;
        }
        if ((long) mid * mid <= x) {
            return mySqrt(x, mid + 1, right);
        } else {
            return mySqrt(x, left, mid - 1);
        }
    }
}
