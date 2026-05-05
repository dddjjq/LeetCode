package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length < 4) {
            return list;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[l], nums[r]);
                        list.add(tmp);
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return list;
    }

    public List<Integer> getList(int i1, int i2, int i3, int i4) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(i1);
        tmp.add(i2);
        tmp.add(i3);
        tmp.add(i4);
        return tmp;
    }
}
