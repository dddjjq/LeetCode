package com.welson.y26.p150;

public class Q201 {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left = left >> 1;
            right = right >> 1;
            shift++;
        }
        return right << shift;
    }
}
