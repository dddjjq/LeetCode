package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

public class Q51 {

    private final List<List<String>> result = new ArrayList<>();
    private char[][] chars;

    public List<List<String>> solveNQueens(int n) {
        chars = new char[n][n];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                chars[i][j] = '.';
            }
        }
        dfs2(n, 0);
        return result;
    }

    public void dfs2(int n, int row) {
        if (row == n) {
            addToList();
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!isValid(row, col)) {
                continue;
            }
            chars[row][col] = 'Q';
            dfs2(n, row + 1);
            chars[row][col] = '.';
        }
    }

    public void addToList() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            strings.add(new String(chars[i]));
        }
        result.add(strings);
    }

    public boolean isValid(int row, int col) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chars.length;
             i--, j++) {
            if (chars[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0;
             i--, j--) {
            if (chars[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
