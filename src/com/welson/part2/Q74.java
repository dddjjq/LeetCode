package com.welson.part2;

public class Q74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = searchRow(matrix, target);
        if (row == -1) {
            return false;
        }
        int col = searchCol(matrix, target, row);
        return col != -1;
    }

    public int searchCol(int[][] matrix, int target, int row) {
        int start = 0;
        int end = matrix[row].length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (matrix[row][middle] > target) {
                end = middle - 1;
            } else if (matrix[row][middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public int searchRow(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int last = 0;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (matrix[middle][0] > target) {
                end = middle - 1;
            } else if (matrix[middle][0] < target) {
                start = middle + 1;
                last = middle;
            } else {
                return middle;
            }
        }
        return last;
    }
}
