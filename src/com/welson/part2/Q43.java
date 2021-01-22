package com.welson.part2;

public class Q43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        char[] chars1 = num1.toCharArray();
        String result = "0";
        for (int i = chars1.length - 1; i >= 0; i--) {
            result = add(result, multi(num2, chars1[i]) + getZero(chars1.length - i - 1));
        }
        return result;
    }

    public String getZero(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    public String add(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int length = Math.min(chars1.length, chars2.length);
        int maxLength = Math.max(chars1.length, chars2.length);
        boolean isLeft = chars1.length > chars2.length;
        char[] chars = new char[maxLength + 1];
        int flag = 0;
        for (int i = length - 1; i >= 0; i--) {
            int temp = 0;
            if (isLeft) {
                temp = chars2[i] - '0' + chars1[i + maxLength - length] - '0' + flag;
            } else {
                temp = chars1[i] - '0' + chars2[i + maxLength - length] - '0' + flag;
            }
            flag = temp / 10;
            chars[i + maxLength - length + 1] = (char) (temp % 10 + '0');
        }
        for (int i = maxLength - length - 1; i >= 0; i--) {
            int temp;
            if (isLeft) {
                temp = (chars1[i] - '0') + flag;
            } else {
                temp = (chars2[i] - '0') + flag;
            }
            flag = temp / 10;
            chars[i + 1] = (char) (temp % 10 + '0');
        }
        chars[0] = (char) (flag % 10 + '0');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && chars[i] == '0') {
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public String multi(String num, char c) {
        int multi = c - '0';
        char[] chars = num.toCharArray();
        int flag = 0;
        char[] result = new char[chars.length + 1];
        for (int i = chars.length - 1; i >= 0; i--) {
            int temp = (chars[i] - '0') * multi + flag;
            flag = temp / 10;
            result[i + 1] = (char) (temp % 10 + '0');
        }
        result[0] = (char) (flag + '0');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == '0') {
                continue;
            }
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
