package com.welson.hot200_1;

import com.sun.source.tree.Tree;
import com.welson.part1.ListNode;
import com.welson.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q114 {
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root, list);
        for (int i = 1; i < list.size() ; i++) {
            TreeNode prev = list.get(i - 1);
            TreeNode cur = list.get(i);
            prev.right = cur;
            prev.left = null;
        }
    }

    public void helper(TreeNode node, List<TreeNode> list) {
        if (node == null) {
            return;
        }
        list.add(node);
        helper(node.left, list);
        helper(node.right, list);
    }
}
