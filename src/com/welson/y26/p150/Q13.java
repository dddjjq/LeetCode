package com.welson.y26.p150;

import java.util.HashMap;

public class Q13 {
    /**
     * 输入: s = "MCMXCIV"
     * 输出: 1994
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int total = 0;
        char pre = ' ';
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 'I') {
                if (pre != 'V' && pre != 'X') {
                    total += 1;
                } else {
                    total -= 1;
                }
            }
            if (chars[i] == 'X') {
                if (pre != 'L' && pre != 'C') {
                    total += 10;
                } else {
                    total -= 10;
                }
            }
            if (chars[i] == 'C') {
                if (pre != 'D' && pre != 'M') {
                    total += 100;
                } else {
                    total -= 100;
                }
            }
            if (chars[i] == 'V') {
                total += 5;
            }
            if (chars[i] == 'L') {
                total += 50;
            }
            if (chars[i] == 'D') {
                total += 500;
            }
            if (chars[i] == 'M') {
                total += 1000;
            }
            pre = chars[i];
        }
        return total;
    }
}
