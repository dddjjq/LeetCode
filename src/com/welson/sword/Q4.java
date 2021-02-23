package com.welson.sword;

public class Q4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null
                || matrix.length == 0
                || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && matrix[i][0] > target) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        while (j >= 0 && matrix[0][j] > target) {
            j--;
        }
        if (j < 0) {
            return false;
        }
        for (int m = 0; m <= i; m++) {
            for (int n = 0; n <= j; n++) {
                if (matrix[m][n] == target) {
                    return true;
                }
            }
        }
        return false;
    }


}
