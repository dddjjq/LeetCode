package com.welson.tree;

import java.util.ArrayList;
import java.util.List;

public class Q99 {

    public void recoverTree(TreeNode root) {
        traversal(root);
        int[] two = findTwo();
        recover(root, 2, two[0], two[1]);
    }

    public void recover(TreeNode root, int count, int f, int s) {
        if (root != null) {
            if (root.val == f || root.val == s) {
                root.val = root.val == f ? s : f;
                if (--count == 0) {
                    return;
                }
            }
            recover(root.left, count, f, s);
            recover(root.right, count, f, s);
        }
    }

    private List<Integer> list = new ArrayList<>();

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        list.add(root.val);
        traversal(root.right);
    }

    public int[] findTwo() {
        int x = -1;
        int y = -1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                y = list.get(i);
                if (x == -1) {
                    x = list.get(i - 1);
                }
            }
        }
        return new int[]{x, y};
    }
}
