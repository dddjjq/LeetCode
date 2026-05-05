package com.welson.hot200_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        char[] chars = s.toCharArray();
        int res = 0;
        for (; right < chars.length; right++) {
            char cur = chars[right];
            while (set.contains(cur)) {
                set.remove(chars[left]);
                left++;
            }
            set.add(cur);
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
