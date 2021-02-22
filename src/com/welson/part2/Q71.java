package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * 71. 简化路径
 */
public class Q71 {
    public String simplifyPath(String path) {
        String[] strings = path.split("/");
        List<String> stack = new ArrayList<>();
        for (String string : strings) {
            if (!string.equals("")) {
                if (string.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.remove(stack.size() - 1);
                    }
                } else if (!string.equals(".")) {
                    stack.add(string);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/");
            sb.append(s);
        }
        if (stack.isEmpty()) {
            sb.append("/");
        }
        return sb.toString();
    }
}
