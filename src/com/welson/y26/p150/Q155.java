package com.welson.y26.p150;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Q155 {

    List<Integer> list = new ArrayList<>();
    List<Integer> min = new ArrayList<>();

    public Q155() {

    }

    public void push(int val) {
        list.add(0, val);
        boolean add = false;
        for (int i = 0; i < min.size(); i++) {
            if (min.get(i) > val) {
                min.add(i, val);
                add = true;
                break;
            }
        }
        if (!add) {
            min.add(val);
        }
    }

    public void pop() {
        int val = list.remove(0);
        for (int i = 0; i < min.size(); i++) {
            if (min.get(i) == val) {
                min.remove(i);
                break;
            }
        }
    }

    public int top() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.get(0);
    }

    public int getMin() {
        if (min.isEmpty()) {
            return -1;
        }
        return min.get(0);
    }
}
