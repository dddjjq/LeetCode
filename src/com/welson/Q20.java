package com.welson;

import java.util.Stack;

/**
 * 有效的括号
 */
public class Q20 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '('
                    || c == '['
                    || c == '{') {
                stack.push(c);
            } else if (c == ')'
                    || c == ']'
                    || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char before = stack.pop();
                if (!isValid(before, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid(char c1, char c2) {
        if (c1 == '(') {
            return c2 == ')';
        } else if (c1 == '[') {
            return c2 == ']';
        } else if (c1 == '{') {
            return c2 == '}';
        }
        return false;
    }
}
