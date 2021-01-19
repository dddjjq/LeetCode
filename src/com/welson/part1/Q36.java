package com.welson.part1;

import java.util.ArrayList;
import java.util.List;

/**
 * char[][] board = new char[][]{
 *                 {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
 *                 {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
 *                 {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
 *                 {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
 *                 {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
 *                 {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
 *                 {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
 *                 {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
 *                 {'.', '.', '.', '.', '.', '.', '.', '.', '.'}};
 */
public class Q36 {
    public boolean isValidSudoku(char[][] board) {
        return isSquareValid(board) && isLineValid(board) && isRowValid(board);
    }

    public boolean isSquareValid(char[][] board) {
        boolean valid = true;
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                char[] chars = getSquare(board, i, j);
                if (!isValid(chars)) {
                    valid = false;
                }
            }
        }
        return valid;
    }

    public char[] getSquare(char[][] board, int line, int row) {
        char[] chars = new char[board.length];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                chars[index++] = board[line + i][row + j];
            }
        }
        return chars;
    }

    public boolean isRowValid(char[][] board) {
        boolean isValid = true;
        for (int i = 0; i < board.length; i++) {
            char[] chars = new char[board.length];
            for (int j = 0; j < board.length; j++) {
                chars[j] = board[j][i];
            }
            if (!isValid(chars)) {
                isValid = false;
            }
        }
        return isValid;
    }

    public boolean isLineValid(char[][] board) {
        boolean isValid = true;
        for (int i = 0; i < board.length; i++) {
            if (!isValid(board[i])) {
                isValid = false;
            }
        }
        return isValid;
    }

    public boolean isValid(char[] chars) {
        List<Character> characters = new ArrayList<>();
        for (char c : chars) {
            if (characters.contains(c)) {
                return false;
            } else if (c != '.'){
                characters.add(c);
            }
        }
        return true;
    }
}
