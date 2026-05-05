package com.welson.hot200_1;

import java.util.*;

public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (String entry : map.keySet()) {
            ans.add(map.get(entry));
        }
        return ans;
    }
}
