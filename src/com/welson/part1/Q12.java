package com.welson.part1;

/**
 * 12. 整数转罗马数字
 */
public class Q12 {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int temp = num % 1000;
        int thousand = num / 1000;
        for (int i = 0; i < thousand; i++) {
            stringBuilder.append("M");
        }
        int hundred = temp / 100;
        temp = temp % 100;
        if (hundred == 9) {
            stringBuilder.append("CM");
        } else if (hundred >= 5) {
            stringBuilder.append("D");
            for (int i = 0; i < hundred - 5; i++) {
                stringBuilder.append("C");
            }
        } else if (hundred == 4) {
            stringBuilder.append("CD");
        } else {
            for (int i = 0; i < hundred; i++) {
                stringBuilder.append("C");
            }
        }
        int ten = temp / 10;
        temp = temp % 10;
        if (ten == 9) {
            stringBuilder.append("XC");
        } else if (ten >= 5) {
            stringBuilder.append("L");
            for (int i = 0; i < ten - 5; i++) {
                stringBuilder.append("X");
            }
        } else if (ten == 4) {
            stringBuilder.append("XL");
        } else {
            for (int i = 0; i < ten; i++) {
                stringBuilder.append("X");
            }
        }
        if (temp == 9) {
            stringBuilder.append("IX");
        } else if (temp >= 5) {
            stringBuilder.append("V");
            for (int i = 0; i < temp - 5; i++) {
                stringBuilder.append("I");
            }
        } else if (temp == 4) {
            stringBuilder.append("IV");
        } else {
            for (int i = 0; i < temp; i++) {
                stringBuilder.append("I");
            }
        }
        return stringBuilder.toString();
    }
}
