package com.welson.y26.p150;

public class Q6 {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        if (numRows <= 1) {
            return s;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < numRows; i++) {
            int firstI = (numRows - i - 1) * 2;
            int lastI = i * 2;
            sb.append(extractFromString(arr, i, firstI, lastI));
        }
        return sb.toString();
    }

    public String extractFromString(char[] arr, int row, int firstI, int lastI) {
        StringBuilder sb = new StringBuilder();
        int index = row;
        boolean first = true;
        if (lastI == 0) {
            lastI = firstI;
        }
        if (firstI == 0) {
            firstI = lastI;
        }

        while (index < arr.length) {
            sb.append(arr[index]);
            if (first) {
                index += firstI;
            } else {
                index += lastI;
            }
            first = !first;
        }
        return sb.toString();
    }
}
