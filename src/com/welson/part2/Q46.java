package com.welson.part2;

import java.util.*;

public class Q46 {

    private final List<List<Integer>> result = new ArrayList<>();
    private final Deque<Integer> list = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) {
            return new ArrayList<>();
        }
        backtrack(nums);
        return result;
    }

    public void backtrack(int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                backtrack(nums);
                list.removeLast();
            }
        }
    }
}
