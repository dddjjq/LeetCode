package com.welson.tree;

public class Q112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null
                && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }

    public static TreeNode createTest() {
        TreeNode t1 = new TreeNode(-2);
        TreeNode t2 = new TreeNode(-3);
        t1.left = t2;
        return t1;
    }
}
