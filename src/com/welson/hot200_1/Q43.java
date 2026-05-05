package com.welson.hot200_1;

import java.util.Objects;

public class Q43 {
    public String multiply(String num1, String num2) {
        if (Objects.equals(num1, "0") || Objects.equals(num2, "0")) {
            return "0";
        }
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        String res = "0";
        for (int i = c2.length - 1; i >= 0; i--) {
            int remain = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < c2.length - 1 - i; j++) {
                sb.append(0);
            }
            for (int j = c1.length - 1; j >= 0; j--) {
                int cal = (c2[i] - '0') * (c1[j] - '0') + remain;
                int prod = cal % 10;
                remain = cal / 10;
                sb.append(prod);
            }
            if (remain != 0) {
                sb.append(remain);
            }
            res = addRes(res, sb.reverse().toString());
        }
        return res;
    }

    public String addRes(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int total = x + y + carry;
            int prod = total % 10;
            carry = total / 10;
            sb.append(prod);
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
