package com.welson.y26.p150;

public class Q392 {
    public boolean isSubsequence(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int first = 0;
        int second = 0;

        while (first<arr1.length && second < arr2.length) {
            if (arr1[first] == arr2[second]) {
                first++;
                second++;
                continue;
            }
            second++;
        }
        return first == arr1.length;
    }
}
