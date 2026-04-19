package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17 {

    Map<Character, String> map = new HashMap<>();
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghl");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(digits,0,new StringBuffer());
        return res;
    }

    public void backtrack(String digits, int index, StringBuffer path) {
        if (path.length() == digits.length()) {
            res.add(path.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        int letterCount = letters.length();
        for (int i = 0; i < letterCount; i++) {
            path.append(letters.charAt(i));
            backtrack(digits, index + 1, path);
            path.deleteCharAt(index);
        }
    }
}
