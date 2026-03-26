package com.welson.y26.p150;

import com.welson.tree.TreeNode;

public class Q222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
