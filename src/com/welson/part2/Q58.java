package com.welson.part2;

/**
 * 58. 最后一个单词的长度
 */
public class Q58 {
    /*public int lengthOfLastWord(String s) {
        String[] temp = s.split(" ");
        if (temp.length == 0) {
            return 0;
        }
        return temp[temp.length - 1].length();
    }*/

    public int lengthOfLastWord(String s) {
        String temp = s.trim();
        int length = temp.length();
        int result = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (temp.charAt(i) == ' ') {
                break;
            }
            result++;
        }
        return result;
    }
}
