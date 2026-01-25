package com.welson.y26.p150;

public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int[] record = new int[255];
        int left = 0;
        int right = 0;
        int len = 0;
        while (right < arr.length) {
            int index = arr[right] - ' ';
            record[index] += 1;
            while (record[index] > 1) {
                record[arr[left] - ' '] -= 1;
                left++;
            }
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

}
