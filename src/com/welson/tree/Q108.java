package com.welson.tree;

public class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTrees(nums, 0, nums.length - 1);
    }

    public TreeNode buildTrees(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int center = (start + end) / 2;
        TreeNode treeNode = new TreeNode(nums[center]);
        treeNode.left = buildTrees(nums, start, center - 1);
        treeNode.right = buildTrees(nums, center + 1, end);
        return treeNode;
    }
}
