package com.welson.hot200_1;

public class Q5 {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1;
            int r = i + 1;
            int len = 1;
            while (l >= 0 && s.charAt(l) == s.charAt(i)) {
                len++;
                l--;
            }
            while (r < s.length() && s.charAt(r) == s.charAt(i)) {
                len++;
                r++;
            }
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                len += 2;
                r++;
                l--;
            }
            if (len > ans.length()) {
                ans = s.substring(l + 1, r);
            }
        }
        return ans;
    }
}
