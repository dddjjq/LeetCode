package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q51 {
    List<List<String>> result = new ArrayList<>();
    boolean[][] visit;

    public List<List<String>> solveNQueens(int n) {
        visit = new boolean[n][n];
        dfs(new ArrayList<>(), 0, n);
        return result;
    }

    public void dfs(List<String> list, int row, int n) {
        if (list.size() == n) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(row, i, n)) {
                StringBuilder sb = new StringBuilder();
                sb.append(".".repeat(i));
                sb.append("Q");
                sb.append(".".repeat(n - i - 1));
                list.add(sb.toString());
                visit[row][i] = true;
                dfs(list, row + 1, n);
                visit[row][i] = false;
                list.removeLast();
            }
        }
    }

    public boolean isValid(int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (visit[i][col]) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (visit[i][j]) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (visit[i][j]) {
                return false;
            }
        }
        return true;
    }
}
