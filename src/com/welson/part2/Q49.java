package com.welson.part2;

import java.util.*;

public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String temp = getSort(s);
            map.getOrDefault(temp, new ArrayList<>()).add(s);
        }
        List<List<String>> lists = new ArrayList<>();
        for (String s : map.keySet()) {
            lists.add(map.get(s));
        }
        return lists;
    }

    public String getSort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
}
