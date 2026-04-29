package com.welson.hot200_1;

import java.util.LinkedList;

public class Q225 {
    class MyStack {

        LinkedList<Integer> queue = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            queue.offerFirst(x);
        }

        public int pop() {
            if (!queue.isEmpty()) {
                return queue.removeFirst();
            }
            return -1;
        }

        public int top() {
            if (!queue.isEmpty()) {
                return queue.peekFirst();
            }
            return -1;
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
