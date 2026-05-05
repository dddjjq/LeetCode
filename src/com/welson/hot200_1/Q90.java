package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90 {

    public List<List<Integer>> result = new ArrayList<>();
    public boolean[] visit;


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        visit = new boolean[nums.length];
        dfs(new ArrayList<>(), nums, 0);
        return result;
    }

    public void dfs(List<Integer> list, int[] nums, int index) {
        if (list.size() <= nums.length) {
            result.add(new ArrayList<>(list));
        }
        if (index >= nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (visit[i]) {
                continue;
            }
            if (i > index && nums[i] == nums[i - 1] && !visit[i - 1]) {
                continue;
            }
            visit[i] = true;
            list.add(nums[i]);
            dfs(list, nums, i);
            visit[i] = false;
            list.removeLast();
        }
    }
}
