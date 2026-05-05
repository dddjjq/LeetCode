package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q216 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(new ArrayList<>(), k, n, 1);
        return ans;
    }

    public void dfs(List<Integer> list, int k, int target, int index) {
        if (target < 0) {
            return;
        }
        if (list.size() == k && target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= 9; i++) {
            list.add(i);
            dfs(list, k, target - i, i + 1);
            list.removeLast();
        }
    }
}
