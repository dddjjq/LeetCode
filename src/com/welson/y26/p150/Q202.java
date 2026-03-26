package com.welson.y26.p150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q202 {

    Set<Integer> set = new HashSet<>();


    public boolean isHappy(int n) {
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = next(n);
        }
        return n == 1;
    }

    private int next(int n) {
        int res = 0;
        while (n > 0) {
            int d = n % 10;
            res += d * d;
            n = n / 10;
        }
        return res;
    }
}
