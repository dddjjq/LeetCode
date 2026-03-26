package com.welson.y26.p150;

import java.util.Stack;

public class Q150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+": {
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    stack.push(val1 + val2);
                    break;
                }
                case "-": {
                    int val2 = stack.pop();
                    int val1 = stack.pop();
                    stack.push(val1 - val2);
                    break;
                }
                case "*": {
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    stack.push(val1 * val2);
                    break;
                }
                case "/": {
                    int val2 = stack.pop();
                    int val1 = stack.pop();
                    stack.push(val1 / val2);
                    break;
                }
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.peek();
    }
}
