package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            count1[c - 'a'] += 1;
        }
        int l = 0;
        int r = 0;
        while (r < s2.length()) {
            count2[s2.charAt(r) - 'a'] += 1;
            if (Arrays.equals(count1, count2)) {
                return true;
            }
            if (r - l == s1.length() - 1) {
                count2[s2.charAt(l) - 'a'] -= 1;
                r++;
                l++;
            } else {
                r++;
            }
        }
        return false;
    }
}
