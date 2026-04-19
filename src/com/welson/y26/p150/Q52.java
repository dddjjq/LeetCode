package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Q52 {


    boolean[] col;
    boolean[] diag1;
    boolean[] diag2;
    int count;

    public int totalNQueens(int n) {
        col = new boolean[n];
        diag1 = new boolean[n * 2];
        diag2 = new boolean[n * 2];
        dfs(0, n);
        return count;
    }

    public void dfs(int row, int n) {
        if (row == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (col[i] || diag1[row - i + n] || diag2[row + i]) continue;
            col[i] = true;
            diag1[row - i + n] = true;
            diag2[row + i] = true;
            dfs(row + 1, n);
            col[i] = false;
            diag1[row - i + n] = false;
            diag2[row + i] = false;
        }
    }
}
