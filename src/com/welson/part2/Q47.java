package com.welson.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q47 {

    private final List<List<Integer>> results = new ArrayList<>();
    private final List<Integer> list = new ArrayList<>();
    private final List<Integer> indexList = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        backtrack(nums);
        return results;
    }

    public void backtrack(int[] nums) {
        if (list.size() == nums.length) {
            results.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]
                    && indexList.contains(i - 1)) {
                continue;
            }
            if (indexList.contains(i)) {
                continue;
            }
            list.add(nums[i]);
            indexList.add(i);
            backtrack(nums);
            list.remove(list.size() - 1);
            indexList.remove(indexList.size() - 1);
        }
    }
}
