package com.welson.y26.p150;

import com.welson.tree.Node;

import java.util.ArrayDeque;

public class Q117 {
    public Node connect(Node root) {
        ArrayDeque<Node> list = new ArrayDeque<>();
        if (root != null ) {
            list.add(root);
        }
        while (!list.isEmpty()) {
            int size = list.size();
            while (size > 0) {
                Node cur = list.pollFirst();
                if (!list.isEmpty() && cur != null && size != 1) {
                    cur.next = list.peekFirst();
                }
                if (cur != null && cur.left != null) {
                    list.add(cur.left);
                }
                if (cur != null && cur.right != null) {
                    list.add(cur.right);
                }
                size--;
            }
        }
        return root;
    }
}
