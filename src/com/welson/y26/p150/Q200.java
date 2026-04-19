package com.welson.y26.p150;

public class Q200 {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (!inArea(i, j, grid) || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public boolean inArea(int i, int j, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
