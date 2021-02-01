package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return new ArrayList<>();
        }
        int minRow = 0;
        int minCol = 0;
        int maxRow = matrix.length - 1;
        int maxCol = matrix[0].length - 1;
        int currentRow = 0;
        int currentCol = 0;
        List<Integer> result = new ArrayList<>();
        int flag = 0;
        while (minRow <= maxRow
                && minCol <= maxCol) {
            result.add(matrix[currentRow][currentCol]);
            if (flag == 0) {
                if (currentCol == maxCol) {
                    flag = 1;
                    minRow++;
                    currentRow++;
                } else {
                    currentCol++;
                }
            } else if (flag == 1) {
                if (currentRow == maxRow) {
                    flag = 2;
                    maxCol--;
                    currentCol--;
                } else {
                    currentRow++;
                }
            } else if (flag == 2) {
                if (currentCol == minCol) {
                    flag = 3;
                    maxRow--;
                    currentRow--;
                } else {
                    currentCol--;
                }
            } else if (flag == 3) {
                if (currentRow == minRow) {
                    flag = 0;
                    minCol++;
                    currentCol++;
                } else {
                    currentRow--;
                }
            }
        }
        return result;
    }
}
