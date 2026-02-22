package com.welson.y26.p150;

import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() != '(') {
                    return false;
                } else  {
                    stack.pop();
                }
            }
            if (c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() != '[') {
                    return false;
                } else  {
                    stack.pop();
                }
            }
            if (c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() != '{') {
                    return false;
                } else  {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
