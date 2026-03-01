package com.welson.y26.p150;

public class Q125 {
    public boolean isPalindrome(String s) {
        String form = s.toLowerCase();
        char[] arr = form.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if ((arr[start] < 'a' || arr[start] > 'z') && (arr[start] < '0' || arr[start] > '9')) {
                start++;
                continue;
            }
            if ((arr[end] < 'a' || arr[end] > 'z') && (arr[end] < '0' || arr[end] > '9')) {
                end--;
                continue;
            }
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
