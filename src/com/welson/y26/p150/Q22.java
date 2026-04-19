package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.List;

public class Q22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, 0, 0, n, new StringBuffer());
        return list;
    }

    public void backtrack(List<String> list, int left, int right, int max, StringBuffer stringBuilder) {
        if (stringBuilder.length() == max * 2) {
            list.add(stringBuilder.toString());
            return;
        }
        if (left < max) {
            stringBuilder.append('(');
            backtrack(list, left + 1, right, max, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if (right < left) {
            stringBuilder.append(')');
            backtrack(list, left, right + 1, max, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
