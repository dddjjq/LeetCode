package com.welson.part1;

public class Q28 {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)){
            return 0;
        }
        int hLength = haystack.length();
        int nLength = needle.length();
        for (int i = 0; i < hLength - nLength + 1; i++) {
            if (haystack.substring(i, nLength + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
