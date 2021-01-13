package com.welson;

public class Q29 {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            } else if (divisor == 1) {
                return Integer.MIN_VALUE;
            }
        }
        long divd = dividend;
        long divs = divisor;
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        divd = Math.abs(divd);
        divs = Math.abs(divs);
        long result = 0;
        while (divd >= divs) {
            long temp = divs;
            long multi = 1;
            while (divd >= (temp << 1)) {
                temp <<= 1;
                multi <<= 1;
            }
            divd -= temp;
            result += multi;
        }
        result = sign == 1 ? result : -result;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }

}
