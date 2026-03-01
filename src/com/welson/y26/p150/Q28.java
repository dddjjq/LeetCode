package com.welson.y26.p150;

public class Q28 {
    public int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        int first = 0;
        int second = 0;
        int last = -1;
        while (first < hay.length && second < need.length) {
            if (hay[first] == need[second]) {
                if (second == need.length - 1) {
                    return first - need.length + 1;
                }
                first++;
                second++;
            } else {
                first = Math.max(0, first - second + 1);
                second = 0;
            }
        }
        return -1;
    }
}
