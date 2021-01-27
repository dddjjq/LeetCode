package com.welson.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Q111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return traversal(root);
    }

    public int traversal(TreeNode root) {
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        int index = 0;
        while (!treeNodes.isEmpty()) {
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodes.remove(0);
                if (node.left != null) {
                    treeNodes.add(node.left);
                }
                if (node.right != null) {
                    treeNodes.add(node.right);
                }
                if (node.right == null && node.left == null) {
                    return index + 1;
                }
            }
            index++;
        }
        return index;
    }
}
