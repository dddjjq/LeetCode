package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q78 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(new ArrayList<>(), nums, 0);
        return result;
    }

    public void dfs(List<Integer> list, int[] nums, int index) {
        if (list.size() <= nums.length) {
            result.add(new ArrayList<>(list));
        }
        if (list.size() > nums.length) {
            return;
        }
        for (int i = index; i <= nums.length; i++) {
            list.add(nums[i]);
            dfs(list, nums, i + 1);
            list.removeLast();
        }
    }
}
