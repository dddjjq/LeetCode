package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q39 {

    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            list.add(candidates[i]);
            dfs(candidates, list, i, target - candidates[i]);
            list.removeLast();
        }
    }
}
