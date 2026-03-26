package com.welson.y26.p150;

import java.util.*;

public class Q49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String afterString = sortString(s);
            if (map.containsKey(afterString)) {
                List<String> old = map.get(afterString);
                old.add(s);
                map.put(afterString, old);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(afterString, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String afterString : map.keySet()) {
            res.add(map.get(afterString));
        }
        return res;
    }

    public String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
}
