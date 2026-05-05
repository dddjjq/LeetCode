package com.welson.hot200_1;

public class Q79 {

    boolean[][] visit;

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        visit = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(i, j, board, 0, word)) {  // 从每个格子开始
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int row, int col, char[][] board, int index, String word) {
        if (row < 0 || row >= board.length) {
            return false;
        }
        if (col < 0 || col >= board[0].length) {
            return false;
        }
        if (visit[row][col]) {
            return false;
        }
        if (board[row][col] != word.charAt(index)){
            return false;
        }
        if (index == word.length()-1) {
            return true;
        }
        visit[row][col] = true;
        boolean result =
                dfs(row + 1, col, board, index+1, word)
                        || dfs(row - 1, col, board, index+1, word)
                        || dfs(row, col + 1, board, index+1, word)
                        || dfs(row, col - 1, board, index+1, word);
        visit[row][col] = false;
        return result;
    }
}
