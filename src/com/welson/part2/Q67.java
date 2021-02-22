package com.welson.part2;

/**
 * 67. 二进制求和
 */
public class Q67 {
    public String addBinary(String a, String b) {
        StringBuffer stringBuilder = new StringBuffer();
        int aLength = a.length();
        int bLength = b.length();
        int maxLen = Math.max(aLength, bLength);
        int carry = 0;
        for (int i = 0; i < maxLen; i++) {
            carry += i < aLength ? a.charAt(aLength - i - 1) - '0' : 0;
            carry += i < bLength ? b.charAt(bLength - i - 1) - '0' : 0;
            stringBuilder.append(carry % 2);
            carry /= 2;
        }
        if (carry != 0) {
            stringBuilder.append(carry);
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
