package com.welson.y26.p150;

public class Q190 {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) | (n & 1);
            n = n >> 1;
        }
        return res;
    }

    public int strToInt(String s) {
        int res = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                res += 1 << i;
            }
        }
        return res;
    }

    public String intToBin(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n & 1);
            n = n / 2;
        }
        return sb.reverse().toString();
    }
}
