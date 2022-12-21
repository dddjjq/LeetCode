package com.welson.part2;

public class Q1753 {

    public int maximumScore(int a, int b, int c) {
        int sum = a + b + c;
        int max = Math.max(a, Math.max(b, c));
        if (max > sum / 2) {
            return sum - max;
        }
        return sum / 2;
    }
}
