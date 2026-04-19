package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.List;

public class Q39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, candidates, target, 0, new ArrayList<>());
        return list;
    }

    public void dfs(List<List<Integer>> combinations, int[] candidates,
                    int target, int index, List<Integer> combination) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]);
            dfs(combinations, candidates, target - candidates[i], i, combination);
            combination.remove(combination.size() - 1);
        }
    }
}
