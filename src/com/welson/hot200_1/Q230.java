package com.welson.hot200_1;

import com.sun.source.tree.Tree;
import com.welson.tree.TreeNode;

public class Q230 {

    int k = 0;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        return dfs(root);
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = dfs(node.left);
        if (left != -1) {
            return left;
        }
        if (--k == 0) {
            return node.val;
        }
        return dfs(node.right);
    }
}
