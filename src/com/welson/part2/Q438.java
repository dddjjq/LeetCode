package com.welson.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 438. 找到字符串中所有字母异位词
 */
public class Q438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        Map<Character, Integer> need = new HashMap<>(), window = new HashMap<>();
        int valid = 0;
        char[] chars = s.toCharArray();
        for (char aChar : p.toCharArray()) {
            need.put(aChar, need.getOrDefault(aChar, 0) + 1);
        }
        while (right < chars.length) {
            char c = chars[right];
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (valid == need.size()) {
                if (right - left == p.length()) {
                    result.add(left);
                }
                char d = chars[left];
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return result;
    }
}
