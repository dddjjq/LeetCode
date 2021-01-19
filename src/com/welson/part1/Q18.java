package com.welson.part1;

import java.util.*;

public class Q18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                int sum = nums[i] + nums[j];
                int start1 = i + 1;
                int end1 = j - 1;
                while (start1 < end1) {
                    sum += nums[start1] + nums[end1];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start1]);
                        list.add(nums[end1]);
                        set.add(list);
                        start1++;
                        end1--;
                    } else if (sum < target) {
                        start1++;
                    } else {
                        end1--;
                    }
                    sum = nums[i] + nums[j];
                }
            }
        }
        return new ArrayList<>(set);
    }
}
