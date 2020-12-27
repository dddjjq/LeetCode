package com.welson;

import java.util.ArrayList;
import java.util.List;

public class Q9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        int j = x;
        do {
            list.add(j % 10);
            j = j / 10;
        } while (j / 10 != 0);
        list.add(j);
        int result = 0;
        int index = list.size();
        for (Integer i : list) {
            result += i * Math.pow(10, index) / 10;
            if (result >= Integer.MAX_VALUE){
                return false;
            }
            index--;
        }
        return result == x;
    }
}
