package com.welson.tree;

import java.util.*;

public class Q114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode preNode = null;
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.pop();
            if (preNode != null) {
                preNode.left = null;
                preNode.right = treeNode;
            }
            TreeNode left = treeNode.left;
            TreeNode right = treeNode.right;
            if (right != null) {
                queue.push(right);
            }
            if (left != null) {
                queue.push(left);
            }
            preNode = treeNode;
        }
    }

}
