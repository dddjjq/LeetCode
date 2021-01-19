package com.welson.part1;

/**
 * 7. 整数反转(easy)
 */
public class Q7 {
    public int reverse(int x) {
        try {
            String temp = String.valueOf(x);
            char[] chars = temp.toCharArray();
            boolean flag = x >= 0;
            StringBuilder stringBuilder = new StringBuilder();
            int last = flag ? 0 : 1;
            if (!flag) {
                stringBuilder.append('-');
            }
            for (int i = chars.length - 1; i >= last; i--) {
                stringBuilder.append(chars[i]);
            }

            return Integer.parseInt(stringBuilder.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}
