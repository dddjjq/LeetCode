package com.welson.y26.p150;

public class Q67 {
    public String addBinary(String a, String b) {
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        int index1 = chars1.length - 1;
        int index2 = chars2.length - 1;
        StringBuilder sb = new StringBuilder();
        int remain = 0;
        while (index1 >= 0 || index2 >= 0) {
            int cur1 = 0;
            int cur2 = 0;
            if (index1 >= 0) {
                cur1 = chars1[index1] - '0';
                index1--;
            }
            if (index2 >= 0) {
                cur2 = chars2[index2] - '0';
                index2--;
            }
            int cur = cur1 + cur2 + remain;
            remain = cur / 2;
            cur = cur % 2;
            sb.insert(0, cur);
        }
        if (remain != 0) {
            sb.insert(0, remain);
        }
        return sb.toString();
    }
}
