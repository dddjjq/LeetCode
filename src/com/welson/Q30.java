package com.welson;

import java.util.*;

public class Q30 {

    public List<Integer> findSubstring(String s, String[] words) {
        if (words == null || words.length == 0 || s == null || s.length() == 0) {
            return null;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String s1 : words) {
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }
        int oneWord = words[0].length();
        int wordLength = oneWord * words.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length() - wordLength + 1; i++) {
            String temp = s.substring(i, i + wordLength);
            int index = 0;
            Map<String, Integer> map1 = new HashMap<>();
            while (index != words.length) {
                String s2 = temp.substring(index * oneWord, index * oneWord
                        + oneWord);
                if (!map.containsKey(s2)){
                    break;
                }
                map1.put(s2, map1.getOrDefault(s2, 0) + 1);
                index++;
            }
            if (map.equals(map1)) {
                result.add(i);
            }
        }
        return result;
    }
}
