package com.welson.hot200_1;

import com.welson.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Q124 {

    public int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lVal = dfs(node.left);
        int rVal = dfs(node.right);
        ans = Math.max(ans, lVal + rVal + node.val);
        return Math.max(Math.max(lVal, rVal) + node.val, 0);
    }
}
