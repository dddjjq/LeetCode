package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.List;

public class Q46 {

    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, nums, new ArrayList<>());
        return res;
    }

    public void dfs(List<List<Integer>> permutes, int[] nums, List<Integer> permute) {
        if (permute.size() == nums.length) {
            permutes.add(new ArrayList<>(permute));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            permute.add(nums[i]);
            dfs(permutes, nums, permute);
            permute.remove(permute.size() - 1);
            used[i] = false;
        }
    }
}
