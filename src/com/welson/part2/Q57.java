package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. 插入区间
 */
public class Q57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        if (newInterval == null) {
            return intervals;
        }
        List<int[]> merged = new ArrayList<>();
        boolean use = false;
        for (int i = 0; i <= intervals.length; i++) {
            int[] temp;
            if (i == intervals.length && !use) {
                temp = newInterval;
            } else {
                temp = intervals[use ? i - 1 : i];
            }

            if (!use && temp[0] >= newInterval[0]) {
                temp = newInterval;
                use = true;
            }
            int left = temp[0];
            int right = temp[1];
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < left) {
                merged.add(temp);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], right);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
