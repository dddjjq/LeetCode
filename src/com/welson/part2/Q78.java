package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 */
public class Q78 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return result;
    }

    public void dfs(int[] nums, int current) {
        result.add(new ArrayList<>(temp));
        if (temp.size() == nums.length) {
            return;
        }
        for (int i = current; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
