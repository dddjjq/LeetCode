package com.welson.part2;

/**
 * 59. 螺旋矩阵 II
 */
public class Q59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int dir = 0;
        int curRow = 0;
        int curCol = 0;
        int maxRow = n - 1;
        int maxCol = n - 1;
        int minRow = 0;
        int minCol = 0;
        int val = 1;
        while (minCol <= maxCol
                && minRow <= maxRow) {
            result[curRow][curCol] = val++;
            if (dir == 0) {
                if (curCol == maxCol) {
                    dir = 1;
                    curRow++;
                    minRow++;
                } else {
                    curCol++;
                }
            } else if (dir == 1) {
                if (curRow == maxRow) {
                    dir = 2;
                    curCol--;
                    maxCol--;
                } else {
                    curRow++;
                }
            } else if (dir == 2) {
                if (curCol == minCol) {
                    dir = 3;
                    curRow--;
                    maxRow--;
                } else {
                    curCol--;
                }
            } else if (dir == 3) {
                if (curRow == minRow) {
                    dir = 0;
                    minCol++;
                    curCol++;
                } else {
                    curRow--;
                }
            }
        }
        return result;
    }
}
