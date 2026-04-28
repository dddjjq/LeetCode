package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
