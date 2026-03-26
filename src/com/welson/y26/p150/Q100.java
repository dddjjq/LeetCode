package com.welson.y26.p150;

import com.welson.tree.TreeNode;

public class Q100 {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null || q == null) {
//            return p == q;
//        }
//        if (p.val != q.val) {
//            return false;
//        }
//        boolean leftSame = isSameTree(p.left, q.left);
//        boolean rightSame = isSameTree(p.right, q.right);
//        return leftSame && rightSame;
//    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);
        return leftSame && rightSame;
    }
}
