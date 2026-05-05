package com.welson.hot200_1;

public class Q316 {
    int[] letters = new int[26];


    public String removeDuplicateLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        boolean[] inAns = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letters[c - 'a']--;
            if (inAns[c - 'a']) {
                continue;
            }
            while (sb.length() != 0
                    && c < sb.charAt(sb.length() - 1)
                    && letters[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                inAns[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(c);
            inAns[c - 'a'] = true;
        }
        return sb.toString();
    }
}
