package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * 66. 加一
 */
public class Q66 {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + carry;
            carry = temp / 10;
            list.add(0, temp % 10   );
        }
        if (carry > 0) {
            list.add(0, carry);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
