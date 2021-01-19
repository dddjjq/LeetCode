package com.welson.part1;

import java.util.*;

public class Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        for (int item : nums1) {
            for (int value : nums2) {
                if (item == value) {
                    result.add(item);
                }
            }
        }
        int[] r = new int[result.size()];
        int index = 0;
        for (Integer integer : result) {
            r[index] = integer;
            index++;
        }
        return r;
    }
}
