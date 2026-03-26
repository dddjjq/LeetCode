package com.welson.y26.p150;

import com.welson.tree.TreeNode;

public class Q114 {

    TreeNode prev = null;

    public void flatten(TreeNode root) {
       if (root == null) {
           return;
       }
        if (prev != null) {
            prev.right = root;
            prev.left = null;
        }

        prev = root;

        TreeNode left = root.left;
        TreeNode right = root.right;

        flatten(left);
        flatten(right);
    }
}
