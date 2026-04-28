package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            if (i <= 2) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    list.add(1);
                }
                result.add(list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                List<Integer> lastList = result.get(i - 2);
                for (int j = 1; j < i - 1; j++) {
                    list.add(lastList.get(j-1) + lastList.get(j));
                }
                list.add(1);
                result.add(list);
            }
        }
        return result;
    }
}
