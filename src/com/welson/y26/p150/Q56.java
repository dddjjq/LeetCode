package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q56 {
    public int[][] merge(int[][] intervals) {
        int length = intervals.length;
        if (length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int[] last = intervals[0];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < length; i++) {
            if (intervals[i][0] >= last[0] && intervals[i][0] <= last[1]) {
                last = new int[]{last[0], Math.max(intervals[i][1],last[1])};
            } else {
                list.add(last);
                last = intervals[i];
            }
        }
        list.add(last);
        return list.toArray(new int[list.size()][]);
    }
}
