package com.welson.part3;

import com.welson.tree.TreeNode;

public class Q979 {

    int sum = 0;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return sum;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        sum += Math.abs(left) + Math.abs(right);
        return root.val + left + right - 1;
    }

}
