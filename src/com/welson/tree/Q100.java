package com.welson.tree;

public class Q100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    public boolean isSame(TreeNode p, TreeNode q) {
        if (p == null) {
            return q == null;
        }
        if (q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
