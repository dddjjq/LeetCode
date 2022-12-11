package com.welson.part3;

public class Q1780 {

    static int[] arr = new int[]{1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969};
    static int length = arr.length;

    public boolean checkPowersOfThree(int n) {
        return dfs(n, 0, 0);
    }

    public boolean dfs(int n, int index, int sum) {
        if (sum == n) {
            return true;
        }
        for (int i = index; i < length; i++) {
            if (dfs(n, i + 1, sum + arr[i])) {
                return true;
            }
        }
        return false;
    }
}
