package com.welson.y26.p150;

public class Q79 {


    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visit = new boolean[board.length][board[0].length];
                    if (backtrack(chars, 0, i, j, board, visit)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[] chars, int index, int row, int col,
                             char[][] board, boolean[][] visit) {
        if (row < 0 || row >= board.length) {
            return false;
        }
        if (col < 0 || col >= board[0].length) {
            return false;
        }
        if (visit[row][col]) {
            return false;
        }
        if (board[row][col] != chars[index]) {
            return false;
        }
        if (index == chars.length - 1) {
            return true;
        }
        visit[row][col] = true;
        boolean found = backtrack(chars, index + 1, row + 1, col, board, visit)
                || backtrack(chars, index + 1, row - 1, col, board, visit)
                || backtrack(chars, index + 1, row, col + 1, board, visit)
                || backtrack(chars, index + 1, row, col - 1, board, visit);
        visit[row][col] = false;
        return found;
    }
}
