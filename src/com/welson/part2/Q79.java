package com.welson.part2;

/**
 * 79. 单词搜索
 */
public class Q79 {

    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0) {
            return false;
        }
        int[][] visit = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, visit, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int[][] visit, int row, int col, String target, int k) {
        if (k == target.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            return false;
        }
        if (board[row][col] != target.charAt(k)) {
            return false;
        }
        if (visit[row][col] == 1){
            return false;
        }
        visit[row][col] = 1;
        int next = k + 1;
        boolean result = dfs(board, visit, row, col + 1, target, next)
                || dfs(board, visit, row + 1, col, target, next)
                || dfs(board, visit, row, col - 1, target, next)
                || dfs(board, visit, row - 1, col, target, next);
        visit[row][col] = 0;
        return result;
    }
}
