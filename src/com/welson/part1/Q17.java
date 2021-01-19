package com.welson.part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17 {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(0, digits, new StringBuilder(), phoneMap, combinations);
        return combinations;
    }

    public void backtrack(int index, String digits, StringBuilder sb, Map<Character, String> map, List<String> combinations) {
        if (sb.length() == digits.length()) {
            combinations.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        String s = map.get(c);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backtrack(index + 1, digits, sb, map, combinations);
            sb.deleteCharAt(index);
        }
    }
}
