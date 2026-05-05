package com.welson.hot200_1;

import com.welson.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q129 {

    List<String> list = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int cur) {
        if (root == null) {
            return 0;
        }
        cur = cur * 10 + root.val;
        if (root.left == null && root.right == null) {
            return cur;
        }
        return dfs(root.left, cur) + dfs(root.right, cur);
    }
}
