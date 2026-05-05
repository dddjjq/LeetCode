package com.welson.hot200_1;

public class Q459 {


    public boolean repeatedSubstringPattern(String s) {
        if (s.isEmpty()) {
            return false;
        }
        int N = s.length();
        int[] next = buildNext(s);
        return next[N - 1] != 0 && N % (N - next[N - 1]) == 0;
    }

    public int[] buildNext(String s) {
        int[] next = new int[s.length()];
        int j = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(j) != s.charAt(i)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
