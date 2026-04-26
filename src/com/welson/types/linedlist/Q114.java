package com.welson.types.linedlist;

import com.sun.source.tree.Tree;
import com.welson.part1.ListNode;
import com.welson.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q114 {
    public void flatten(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        helper(root, nodes);
        TreeNode prev = null;
        for (TreeNode n : nodes) {
            if (prev != null) {
                prev.left = null;
                prev.right = n;
            }
            prev = n;
        }
    }

    public void helper(TreeNode node, List<TreeNode> list) {
        if (node != null) {
            list.add(node);
            helper(node.left, list);
            helper(node.right, list);
        }
    }
}
