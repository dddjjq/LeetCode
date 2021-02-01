package com.welson.part2;

import java.util.*;

public class Q76 {

    public String minWindow(String s, String t) {
        char[] chars = t.toCharArray();
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : chars) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (valid == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char remove = s.charAt(left);
                left++;
                if (need.containsKey(remove)) {
                    if (window.get(remove).equals(need.get(remove))) {
                        valid--;
                    }
                    window.put(remove, window.get(remove) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE
                ? "" : s.substring(start, start + len);
    }
}
