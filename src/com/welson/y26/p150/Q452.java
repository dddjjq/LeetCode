package com.welson.y26.p150;

import java.util.Arrays;
import java.util.Comparator;

public class Q452 {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n <= 1) {
            return n;
        }
        int total = 1;
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int[] sub = points[0];
        for (int i = 1; i < points.length; i++) {
            if (sub[1] < points[i][0] || sub[0] > points[i][1]) {
                sub = points[i];
                total++;
            } else {
                sub[0] = Math.max(sub[0], points[i][0]);
                sub[1] = Math.min(sub[1], points[i][1]);
                if (i == points.length - 1) {
                    total++;
                }
            }
        }
        return total;
    }
}
