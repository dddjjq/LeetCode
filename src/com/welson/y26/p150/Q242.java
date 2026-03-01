package com.welson.y26.p150;

import java.util.HashMap;
import java.util.Map;

public class Q242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for (char c : sArr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : tArr) {
            if (map.containsKey(c)) {
                int count = map.get(c) - 1;
                if (count == 0) {
                    map.remove(c);
                } else  {
                    map.put(c,count);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
}
