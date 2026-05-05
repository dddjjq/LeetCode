package com.welson.hot200_1;

public class Q1502 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satiSum = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] != 1) {
                satiSum += customers[i];
            }
        }
        int extra = 0;
        int maxExtra = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
            if (i >= minutes && grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }
            maxExtra = Math.max(maxExtra, extra);
        }
        return maxExtra + satiSum;
    }
}
