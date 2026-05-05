package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q17 {

    public HashMap<Integer, String> map = new HashMap<>();
    public List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        initMap();
        dfs(digits, 0, new StringBuilder());
        return result;
    }

    public void dfs(String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }
        int cur = digits.charAt(index) - '0';
        String str = map.get(cur);
        if (str == null) {
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            dfs(digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public void initMap() {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }
}
