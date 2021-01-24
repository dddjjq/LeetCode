package com.welson.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Q102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        queue.add(root);
        traversal();
        return result;
    }

    private final List<TreeNode> queue = new ArrayList<>();
    private final List<List<Integer>> result = new ArrayList<>();

    public void traversal() {
        List<Integer> list = new ArrayList<>();
        if (queue.isEmpty()) {
            return;
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove(0);
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(new ArrayList<>(list));
            list.clear();
        }
    }

    public TreeNode createTest() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t2.left = t4;
        t2.right = t5;
        t1.right = t3;
        return t1;
    }
}
