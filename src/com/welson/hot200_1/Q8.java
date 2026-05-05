package com.welson.hot200_1;

public class Q8 {
    public int myAtoi(String s) {
        if(s.trim().isEmpty()) {
            return 0;
        }
        char[] chars = s.trim().toCharArray();
        long num = 0;
        int negative = 1;
        int startIndex = 0;
        if (chars[0] == '+' || chars[0] == '-') {
            negative = (chars[0] == '-') ? -1 : 1;
            startIndex = 1;
        }
        for (int i = startIndex; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return getNum(num, negative);
            }
            num = num * 10 + (chars[i] - '0');
            if (num > Integer.MAX_VALUE) {
                return getNum(num, negative);
            }
        }
        return getNum(num, negative);
    }

    public int getNum(long num, int negative) {
        num = num * negative;
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) num;
    }
}
