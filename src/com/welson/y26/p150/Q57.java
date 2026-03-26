package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.List;

public class Q57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        List<int[]> list = new ArrayList<>();
        boolean placed = false;
        for (int[] interval : intervals) {
            if (interval[1] < left) {
                list.add(interval);
            } else if (interval[0] > right) {
                if (!placed) {
                    list.add(new int[]{left, right});
                    placed = true;
                }
                list.add(interval);
            } else {
                left = Math.min(left,interval[0]);
                right = Math.max(right,interval[1]);
            }
        }
        if (!placed) {
            list.add(new int[]{left, right});
        }
        return list.toArray(new int[list.size()][]);
    }
}
