package com.welson.hot200_1;

import com.welson.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Q103 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        List<List<Integer>> list = new ArrayList<>();
        int flag = 1;
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
                    if (flag > 0) {
                        innerList.add(cur.val);
                    } else {
                        innerList.add(0, cur.val);
                    }
                }
            }
            list.add(innerList);
            flag = flag * -1;
        }
        return list;
    }
}
