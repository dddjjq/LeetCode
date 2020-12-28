package com.welson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    result.add(list);
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;
                    end--;
                    start++;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
