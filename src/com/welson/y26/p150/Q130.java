package com.welson.y26.p150;

public class Q130 {
    public void solve(char[][] board) {
        int n = board.length;
        if (n == 0) {
            return;
        }
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            dfs(board, i, 0);
            dfs(board, i, m - 1);
        }
        for (int i = 1; i < m; i++) {
            dfs(board, 0, i);
            dfs(board, n - 1, i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j]=='O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, int i, int j) {
        if (!inArea(board, i, j) || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'A';
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
    }

    public boolean inArea(char[][] board, int i, int j) {
        int n = board.length;
        int m = board[0].length;
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
