package com.welson.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Q1305 {

    public static void main(String[] args) {
        Q1305 q = new Q1305();
        TreeNode node1 = TreeNodeFactory.create5();
        TreeNode node2 = TreeNodeFactory.create6();
        System.out.println(q.getAllElements(node1, node2));
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> list1 = new ArrayDeque<>();
        Queue<Integer> list2 = new ArrayDeque<>();
        traversalFirstTree(root1, list1);
        traversalFirstTree(root2, list2);
        return mergeList(list1, list2);
    }

    public List<Integer> mergeList(Queue<Integer> list1, Queue<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        while (!list1.isEmpty()
                || !list2.isEmpty()) {
            if (!list1.isEmpty() && !list2.isEmpty()) {
                if (list1.peek() <= list2.peek()) {
                    result.add(list1.poll());
                } else {
                    result.add(list2.poll());
                }
            } else if (!list1.isEmpty()) {
                result.add(list1.poll());
            } else {
                result.add(list2.poll());
            }
        }
        return result;
    }

    public void traversalFirstTree(TreeNode root1, Queue<Integer> list) {
        if (root1 == null) {
            return;
        }
        traversalFirstTree(root1.left, list);
        list.offer(root1.val);
        traversalFirstTree(root1.right, list);
    }
}
