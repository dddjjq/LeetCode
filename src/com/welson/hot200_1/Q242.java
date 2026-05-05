package com.welson.hot200_1;

public class Q242 {

    int[] letters = new int[26];

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a'] += 1;
            letters[t.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
