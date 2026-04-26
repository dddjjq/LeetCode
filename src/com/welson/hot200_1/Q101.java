package com.welson.hot200_1;

import com.welson.tree.TreeNode;

public class Q101 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right)
                && isSymmetric(left.right, right.left);
    }
}
