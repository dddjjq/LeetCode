package com.welson.y26.p150;

public class Q58 {
    public int lengthOfLastWord(String s) {
        String[] temp = s.split(" ");
        return temp[temp.length - 1].length();
    }

}
