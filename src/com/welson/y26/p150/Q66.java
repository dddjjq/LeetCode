package com.welson.y26.p150;

public class Q66 {
    public int[] plusOne(int[] digits) {
        int[] ans = new int[digits.length];
        int remain = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + remain < 10) {
                ans[i] = digits[i] + remain;
                remain = 0;
            } else {
                ans[i] = (digits[i] + remain) % 10;
                remain = 1;
            }
        }
        if (remain == 0) {
            return ans;
        }
        int[] finalAns = new int[digits.length + 1];
        finalAns[0] = 1;
        System.arraycopy(ans,0,finalAns,1,ans.length);
        return finalAns;
    }
}
