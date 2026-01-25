package com.welson.y26.p150;

import java.util.HashMap;

public class Q169 {
    public int majorityElement(int[] nums) {
        int limit = nums.length / 2;
        int[] temp = new int[limit];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int lastSize = map.get(nums[i]);
                map.put(nums[i], lastSize + 1);
                if (lastSize + 1 > limit) {
                    return nums[i];
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return nums[0];
    }
}
