package com.welson.y26.p150;

public class Q74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        int top = 0;
        int bottom = row;
        int targetRow = row;
        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (matrix[mid][0] <= target) {
                targetRow = mid;
                top = mid + 1;
            } else {
                bottom = mid - 1;
            }
        }
        int left = 0;
        int right = col;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[targetRow][mid] == target) {
                return true;
            }
            if (matrix[targetRow][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
