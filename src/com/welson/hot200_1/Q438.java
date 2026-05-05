package com.welson.hot200_1;

import java.util.*;

public class Q438 {
    int[] set = new int[26];

    public List<Integer> findAnagrams(String s, String p) {
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            pCount[c - 'a'] += 1;
        }
        List<Integer> ans = new ArrayList<>();
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            sCount[s.charAt(r) - 'a'] += 1;
            if (Arrays.equals(sCount, pCount)) {
                ans.add(l);
            }
            if (r - l == p.length() - 1) {
                sCount[s.charAt(l) - 'a'] -= 1;
                r++;
                l++;
            } else {
                r++;
            }
        }
        return ans;
    }
}
