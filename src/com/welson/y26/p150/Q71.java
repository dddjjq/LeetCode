package com.welson.y26.p150;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Stack;

public class Q71 {
    public String simplifyPath(String path) {
        String[] elements = path.split("/");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String element : elements) {
            if (!element.isEmpty()) {
                if (Objects.equals(element, "..")) {
                    if (!stack.isEmpty()) {
                        stack.removeLast();
                    }
                } else if (!element.equals(".")){
                    stack.addLast(element);
                }
            }
        }
        StringBuilder res = new StringBuilder("/");
        int index=  0;
        for (String element: stack) {
            res.append(element);
            if (index< stack.size()-1) {
                res.append("/");
            }
            index++;
        }
        return res.toString();
    }
}
