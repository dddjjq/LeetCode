package com.welson.y26.p150;

public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) {
            return "";
        }
        int index = 1;
        String temp;
        String res = "";
        while (index <= strs[0].length()) {
            temp = strs[0].substring(0, index);
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(temp)) {
                    return res;
                }
            }
            index++;
            res = temp;
        }
        return res;
    }
}
