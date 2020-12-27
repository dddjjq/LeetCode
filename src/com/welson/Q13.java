package com.welson;

/**
 * 13. 罗马数字转整数
 */
public class Q13 {

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            int val = getValue(chars[i]);
            result += val;
            if (i > 0){
                int temp = getValue(chars[i-1]);
                if(temp < val){
                    result -= temp;
                    i--;
                }
            }
        }
        return result;
    }

    public int getValue(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            default:
                return 1;
        }
    }
}
