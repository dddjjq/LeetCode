package com.welson.hot200_1;

import java.util.Stack;

public class Q232 {
    class MyQueue {

        public Stack<Integer> first = new Stack<>();
        public Stack<Integer> second = new Stack<>();


        public MyQueue() {

        }

        public void push(int x) {
            first.push(x);
        }

        public int pop() {
            if (second.isEmpty()) {
                while (!first.isEmpty()) {
                   second.push(first.pop());
                }
            }
            return second.pop();
        }

        public int peek() {
            if (second.isEmpty()) {
                while (!first.isEmpty()) {
                    second.push(first.pop());
                }
            }
            return second.peek();
        }

        public boolean empty() {
            return second.isEmpty() && first.empty();
        }
    }
}
