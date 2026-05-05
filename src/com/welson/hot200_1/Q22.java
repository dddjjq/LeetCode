package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q22 {

    public List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(0, 0, n, new StringBuilder());
        return ans;
    }

    public void dfs(int l, int r, int n, StringBuilder sb) {
        if (sb.length() == n * 2) {
            ans.add(sb.toString());
            return;
        }
        if (l < n) {
            sb.append('(');
            dfs(l + 1, r, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (r < l) {
            sb.append(')');
            dfs(l, r + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
