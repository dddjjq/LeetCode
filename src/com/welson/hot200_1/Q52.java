package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q52 {
    int ans = 0;
    boolean[] col;
    boolean[] diag1;
    boolean[] diag2;

    public int totalNQueens(int n) {
        col  = new boolean[n];
        diag1 = new boolean[n];
        diag2 = new boolean[n];
        dfs( 0, n);
        return ans;
    }

    public void dfs(int row, int n) {
        if (row == n) {
            ans++;
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
