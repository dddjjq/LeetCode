package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

public class Q73 {
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int i : rows) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i : cols) {
            for (int j = 0; j < row; j++) {
                matrix[j][i] = 0;
            }
        }
    }
}
