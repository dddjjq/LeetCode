package com.welson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {

    private final List<List<Integer>> lists = new ArrayList<>();
    private final List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return lists;
    }

    public void backtrack(int[] candidates, int target, int index) {
        if (target == 0) {
            lists.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i - 1] == candidates[i]) {
                continue;
            }
            temp.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
