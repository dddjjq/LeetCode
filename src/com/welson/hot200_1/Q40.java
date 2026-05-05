package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, new ArrayList<>(), 0, target);
        return result;
    }

    public void dfs(int[] candidates, List<Integer> list, int index, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            list.add(candidates[i]);
            dfs(candidates, list, i + 1, target - candidates[i]);
            list.removeLast();
        }
    }
}
