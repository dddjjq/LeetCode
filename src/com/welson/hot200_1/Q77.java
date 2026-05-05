package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q77 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(new ArrayList<>(), k, n, 1);
        return result;
    }

    public void dfs(List<Integer> list, int k, int n, int index) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= n; i++) {
            list.add(i);
            dfs(list, k, n, i + 1);
            list.removeLast();
        }
    }
}
