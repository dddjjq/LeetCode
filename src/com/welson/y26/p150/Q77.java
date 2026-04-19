package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.List;

public class Q77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, 1, n, k, new ArrayList<>());
        return res;
    }


    public void dfs(List<List<Integer>> combinations, int index, int n, int k, List<Integer> combination) {
        if (combination.size() > k) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        for (int i = index; i <= n; i++) {
            int lastIndex = combination.size();
            combination.add(i);
            dfs(combinations, i + 1, n, k, combination);
            combination.remove(lastIndex);
        }
    }
}
