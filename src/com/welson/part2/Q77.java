package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 */
public class Q77 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(n, 1, k);
        return result;
    }

    public void dfs(int n, int current, int target) {
        if (temp.size() == target) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = current; i < n + 1; i++) {
            temp.add(i);
            dfs(n, i+1, target);
            temp.remove(temp.size() - 1);
        }
    }
}
