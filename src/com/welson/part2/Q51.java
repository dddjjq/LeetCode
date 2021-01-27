package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

public class Q51 {

    private final List<List<String>> result = new ArrayList<>();
    private final List<String> list = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        dfs(n, 0);
        return result;
    }

    public void dfs(int n, int index) {
        if (list.size() == n) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < n; i++) {
            if (!isValid(i)) {
                continue;
            }
            list.add(getLine(i, n));
            dfs(n, index);
            list.remove(list.size() - 1);
        }
    }

    public boolean isValid(int index) {
        if (list.isEmpty()) {
            return true;
        }
        int preLine = 0;
        for (String s : list) {
            int preIndex = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'Q') {
                    preIndex = i;
                }
            }
            if (index == preIndex) {
                return false;
            }
            if (Math.abs(preLine - index) == 1) {
                if (Math.abs(preIndex - index) <= 1) {
                    return false;
                }
            }
            preLine++;
        }
        return true;
    }

    public String getLine(int index, int n) {
        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            if (i == index) {
                chars[i] = 'Q';
            } else {
                chars[i] = '.';
            }
        }
        return new String(chars);
    }
}
