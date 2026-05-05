package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q47 {
    public List<List<Integer>> result = new ArrayList<>();
    boolean[] visit;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        visit = new boolean[nums.length];
        dfs(nums, new ArrayList<>());
        return result;
    }

    public void dfs(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visit[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i-1] && !visit[i-1]) {
                continue;
            }
            list.add(nums[i]);
            visit[i] = true;
            dfs(nums, list);
            list.removeLast();
            visit[i] = false;
        }
    }
}
