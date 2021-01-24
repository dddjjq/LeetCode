package com.welson.tree;

import java.util.ArrayList;
import java.util.List;

public class Q95 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return null;
        }
        return buildTrees(1, n);
    }

    public List<TreeNode> buildTrees(int start, int end) {
        List<TreeNode> treeNodes = new ArrayList<>();
        if (start > end) {
            treeNodes.add(null);
            return treeNodes;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = buildTrees(start, i - 1);
            List<TreeNode> right = buildTrees(i + 1, end);
            for (TreeNode t1 : left) {
                for (TreeNode t2 : right) {
                    TreeNode cur = new TreeNode(i);
                    cur.left = t1;
                    cur.right = t2;
                    treeNodes.add(cur);
                }
            }
        }
        return treeNodes;
    }

}
