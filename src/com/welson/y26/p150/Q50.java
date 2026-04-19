package com.welson.y26.p150;

import java.util.Map;

public class Q50 {
    public double myPow(double x, int n) {
        double ans = 1;
        ans = helper(x, Math.abs(n));
        if (n > 0) {
            return ans;
        } else {
            return 1 / ans;
        }
    }

    public double helper(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        }
        return half * half * x;
    }
}
