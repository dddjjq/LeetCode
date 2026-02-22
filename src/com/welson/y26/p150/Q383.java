package com.welson.y26.p150;

public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] dict = new int[26];
        char[] magazineArr = magazine.toCharArray();
        for (char c : magazineArr) {
            dict[c - 'a'] += 1;
        }
        char[] ransomArr = ransomNote.toCharArray();
        for (char c : ransomArr) {
            if (dict[c - 'a'] <= 0 ){
                return false;
            }
            dict[c - 'a'] -= 1;
        }
        return true;
    }
}
