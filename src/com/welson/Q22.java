package com.welson;

import java.util.ArrayList;
import java.util.List;

public class Q22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(new StringBuilder(), 0, 0, n, result);
        return result;
    }

    public void backtrack(StringBuilder stringBuilder, int left, int right, int count, List<String> list) {
        if (stringBuilder.toString().length() == count * 2) {
            list.add(stringBuilder.toString());
            return;
        }
        if (left < count) {
            stringBuilder.append("(");
            backtrack(stringBuilder, left+1, right, count, list);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if (right < left) {
            stringBuilder.append(")");
            backtrack(stringBuilder, left, right+1, count, list);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
