package com.welson.y26.p150;

import com.welson.tree.TreeNode;

public class Q104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left) + 1;
        int rightMax = maxDepth(root.right) + 1;
        return Math.max(leftMax, rightMax);
    }
}
