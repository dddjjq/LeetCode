package com.welson.part2;


public class Q52 {

    private int mCount = 0;
    private char[][] chars;

    public int totalNQueens(int n) {
        chars = new char[n][n];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                chars[i][j] = '.';
            }
        }
        dfs2(n, 0);
        return mCount;
    }

    public void dfs2(int n, int row) {
        if (row == n) {
            mCount++;
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
