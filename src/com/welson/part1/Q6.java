package com.welson.part1;

import java.util.ArrayList;
import java.util.List;

/**
 * Z 字形变换
 */
public class Q6 {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        List<StringBuilder> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            result.add(new StringBuilder());
        }
        boolean down = true;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            result.get(index).append(s.charAt(i));
            index = down ? ++index : --index;
            if (index == numRows - 1 || index == 0) {
                down = !down;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder stringBuilder : result) {
            sb.append(stringBuilder.toString());
        }
        return sb.toString();
    }
}
