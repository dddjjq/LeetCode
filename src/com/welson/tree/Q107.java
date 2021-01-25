package com.welson.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        helper(root);
        return lists;
    }

    public List<List<Integer>> lists = new ArrayList<>();


    public void helper(TreeNode root) {
        Queue<TreeNode> list = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        list.add(root);
        while (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = list.poll();
                if (node != null){
                    if (node.left != null) {
                        list.offer(node.left);
                    }
                    if (node.right != null) {
                        list.offer(node.right);
                    }
                    result.add(node.val);
                }
            }
            lists.add(0, new ArrayList<>(result));
            result.clear();
        }
    }
}
