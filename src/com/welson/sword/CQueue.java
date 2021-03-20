package com.welson.sword;

import java.util.Stack;

public class CQueue {

    private final Stack<Integer> pushStack;
    private final Stack<Integer> popStack;

    public CQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void appendTail(int value) {
        pushStack.push(value);
    }

    public int deleteHead() {
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        if (!popStack.isEmpty()) {
            return popStack.pop();
        }
        return -1;
    }
}
