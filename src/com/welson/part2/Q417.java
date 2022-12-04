package com.welson.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q417 {


    public static void main(String[] args) {
        int[][] heights = {
                {1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}

        };
        Q417 q417 = new Q417();
        List<List<Integer>> list = q417.pacificAtlantic(heights);
        System.out.println(list);
    }

    int[][] dirs = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            dfs(i, 0, heights, pacific);
        }
        for (int j = 1; j < col; j++) {
            dfs(0, j, heights, pacific);
        }
        for (int i = 0; i < row; i++) {
            dfs(i, col - 1, heights, atlantic);
        }
        for (int j = 0; j < col - 1; j++) {
            dfs(row - 1, j, heights, atlantic);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    result.add(temp);
                }
            }
        }
        return result;
    }

    public void dfs(int row, int col, int[][] heights, boolean[][] ocean) {
        if (ocean[row][col]) {
            return;
        }
        int n = heights.length;
        int m = heights[0].length;
        ocean[row][col] = true;
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < n
                    && newCol >= 0 && newCol < m
                    && heights[newRow][newCol] >= heights[row][col]
            ) {
                dfs(newRow, newCol, heights, ocean);
            }
        }
    }
}
