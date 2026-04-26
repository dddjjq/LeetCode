package com.welson.hot200_1;

import com.welson.part1.ListNode;
import com.welson.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        List<List<Integer>> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> innerList = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                TreeNode cur = queue.pollFirst();
                if (cur != null) {
                    if (cur.left != null) {
                        queue.offer(cur.left);

                    }
                    if (cur.right != null) {
                        queue.offer(cur.right);
                    }
                    innerList.add(cur.val);
                }
            }
            list.add(innerList);
        }
        return list;
    }
}
