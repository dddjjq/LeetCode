package com.welson.part1;

public class Q38 {
    public String countAndSay(int n) {
        return count(n, new String[n]);
    }

    public String count(int n, String[] strings) {
        if (n == 1 || n == 0) {
            strings[n - 1] = "1";
            return "1";
        } else {
            if (strings[n - 1] != null) {
                return describeString(strings[n - 1]);
            }
            String temp = count(n - 1, strings);
            strings[n - 1] = temp;
            return describeString(temp);
        }
    }

    public String describeString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char before = chars[0];
        int size = 1;
        for (int i = 1; i < s.length(); i++) {
            if (chars[i] == before) {
                size++;
            } else {
                sb.append(size);
                sb.append(before);
                before = chars[i];
                size = 1;
            }
        }
        sb.append(size);
        sb.append(before);
        return sb.toString();
    }

}
