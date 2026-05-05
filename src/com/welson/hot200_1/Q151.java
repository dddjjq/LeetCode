package com.welson.hot200_1;

public class Q151 {
    public String reverseWords(String s) {
        String target = s.trim();
        String[] strs = target.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i++) {
            if (strs[i].isEmpty()) {
                continue;
            }
            sb.append(strs[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
