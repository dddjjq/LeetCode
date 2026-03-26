package com.welson.y26.p150;

import java.util.*;

public class Q128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int longest = 0;
        for (int num : nums) {
            int cur = num;
            int max = 0;
            if (!set.contains(cur - 1)) {
                while (set.contains(cur)) {
                    max++;
                    cur++;
                }
            }
            longest = Math.max(longest, max);
        }
        return longest;
    }
}
