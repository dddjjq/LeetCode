package com.welson.y26.p150;

import com.welson.tree.TreeNode;

public class Q112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum, 0);
    }

    public boolean hasPathSum(TreeNode root, int targetSum, int curSum) {
        if (root == null) {
            return false;
        }
        curSum = curSum + root.val;
        if (root.left == null && root.right == null && curSum == targetSum) {
            return true;
        }
        if (hasPathSum(root.left, targetSum, curSum)) {
            return true;
        }
        return hasPathSum(root.right, targetSum, curSum);
    }
}
