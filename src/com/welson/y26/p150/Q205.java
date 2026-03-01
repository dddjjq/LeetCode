package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Q205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int n = s.length();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        HashMap<Character, Character> fromMap = new HashMap<>();
        HashMap<Character, Character> toMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Character fromExist = fromMap.get(sArr[i]);
            if (fromExist != null && tArr[i] != fromExist) {
                return false;
            }
            Character toExist = toMap.get(tArr[i]);
            if (toExist != null && sArr[i] != toExist) {
                return false;
            }
            fromMap.put(sArr[i], tArr[i]);
            toMap.put(tArr[i], sArr[i]);
        }
        return true;
    }
}
