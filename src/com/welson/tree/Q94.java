package com.welson.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q94 {

    private final List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traversal2(root);
        return list;
    }

    public void traversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        traversal(treeNode.left);
        list.add(treeNode.val);
        traversal(treeNode.right);
    }

    public void traversal2(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = treeNode;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            if (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                list.add(node.val);
                currentNode = node.right;
            }
        }
    }
}
