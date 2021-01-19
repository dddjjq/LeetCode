package com.welson.part1;

/**
 * 8. 字符串转换整数 (atoi)(medium)
 */
public class Q8 {
    public int myAtoi(String s) {
        String result = parseInteger(s.trim());
        if (result == null) {
            return 0;
        }
        boolean isNega = result.startsWith("-");
        try {
            return Integer.parseInt(result);
        } catch (Exception e) {
            if (isNega) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    private String parseInteger(String s) {
        char[] chars = s.toCharArray();
        boolean isNega = s.startsWith("-");
        boolean isPosi = s.startsWith("+");
        if (chars.length == 0) {
            return null;
        }
        if (!isNega && !isNum(chars[0]) && !isPosi) {
            return null;
        }
        int i = isNega | isPosi ? 1 : 0;
        for (; i < chars.length; i++) {
            if (!isNum(chars[i])) {
                break;
            }
        }
        if (isNega | isPosi) {
            if (i == 1) {
                return null;
            }
        } else {
            if (i == 0) {
                return null;
            }
        }
        return s.substring(0, i);
    }

    private boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }
}
