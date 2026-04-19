package com.welson.y26.p150;

public class Q172 {
    public int trailingZeroes(int n) {
        int ans = 0;
        for (int i = n; i >= 1; i--) {
            int x = i;
            while (x % 5 == 0) {
                ans++;
                x = x / 5;
            }
        }
        return ans;
    }
}
