package com.welson.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 */
public class Q56 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return null;
        }
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int L = intervals[i][0];
            int R = intervals[i][1];
            if (result.size() == 0 || result.get(result.size() - 1)[1] < L) {
                result.add(new int[]{L, R});
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1],
                        R);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
