package com.welson.y26.p150;

import java.util.HashMap;
import java.util.Objects;

public class Q290 {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        char[] sArr = pattern.toCharArray();
        String[] tArr = s.split(" ");
        if (tArr.length != n) {
            return false;
        }
        HashMap<Character, String> fromMap = new HashMap<>();
        HashMap<String, Character> toMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String fromExist = fromMap.get(sArr[i]);
            if (fromExist != null && !Objects.equals(tArr[i], fromExist)) {
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
