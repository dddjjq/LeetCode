package com.welson.tree;

import java.util.ArrayList;
import java.util.List;

public class Q113 {

    private final List<List<Integer>> result = new ArrayList<>();
    private final List<Integer> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return new ArrayList<>();
        }
        list.add(root.val);
        backtrack(root, targetSum);
        return result;
    }

    public void backtrack(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        if (root.left == null
                && root.right == null
                && root.val == targetSum) {
            result.add(new ArrayList<>(list));
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                if (root.left != null) {
                    list.add(root.left.val);
                    backtrack(root.left, targetSum - root.val);
                    list.remove(list.size()-1);
                }
            } else {
                if (root.right != null) {
                    list.add(root.right.val);
                    backtrack(root.right, targetSum - root.val);
                    list.remove(list.size()-1);
                }
            }
        }
    }

    public void helper(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null
                && root.right == null) {
            if (targetSum == root.val) {
                result.add(new ArrayList<>(list));
                list.clear();
            }
            return;
        }
        helper(root.left, targetSum - root.val);
        helper(root.right, targetSum - root.val);
    }
}
