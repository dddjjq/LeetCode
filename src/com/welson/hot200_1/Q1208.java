package com.welson.hot200_1;

public class Q1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int curCost = 0;
        int l = 0;
        int r = 0;
        int ans = 0;
        while (r < chars1.length) {
            curCost += Math.abs(chars2[r] - chars1[r]);
            while (curCost > maxCost) {
                curCost -= Math.abs(chars2[l] - chars1[l]);
                l++;
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
