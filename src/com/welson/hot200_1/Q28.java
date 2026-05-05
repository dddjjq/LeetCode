package com.welson.hot200_1;

public class Q28 {
    public int strStr(String haystack, String needle) {
        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] == char2[0]) {
                int j = i;
                int index = 0;
                while (j < char1.length
                        && index < char2.length
                        && char1[j] == char2[index]) {
                    j++;
                    index++;
                }
                if (index == char2.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
