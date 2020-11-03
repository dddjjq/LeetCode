package com.welson;

/**
 * 941. 有效的山脉数组
 * 双指针法 还要判断边界条件
 */
public class Q941 {
    public boolean validMountainArray(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (A.length - 1 > start && A[start] < A[start + 1]) {
            start++;
        }
        while (end > 0 && A[end] < A[end - 1]) {
            end--;
        }
        if (start == 0 || end == A.length-1){
            return false;
        }
        return start == end;
    }
}
