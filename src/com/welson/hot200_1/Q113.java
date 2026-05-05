package com.welson.hot200_1;

import com.sun.source.tree.Tree;
import com.welson.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q113 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,new ArrayList<>());
        return result;
    }

    public void helper(TreeNode root, int targetSum, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                result.add(new ArrayList<>(list));
            }
        }
        helper(root.left, targetSum - root.val, list);
        helper(root.right, targetSum - root.val, list);
        list.removeLast();
    }
}
