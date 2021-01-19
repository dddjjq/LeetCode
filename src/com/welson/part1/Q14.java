package com.welson.part1;

/**
 * 14. 最长公共前缀
 */
public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].toCharArray()[j];
            boolean needBreak = false;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= j || c != strs[i].toCharArray()[j]) {
                    needBreak = true;
                    break;
                }
            }
            if (needBreak) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public int getMinLength(String[] arr) {
        int result = arr[0].length();
        for (String s : arr) {
            result = Math.min(result, s.length());
        }
        return result;
    }
}
