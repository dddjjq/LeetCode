package com.welson.sword;

import com.welson.tree.TreeNode;

/**
 * 07. 重建二叉树
 */
public class Q7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart == pEnd) {
            return new TreeNode(preorder[pStart]);
        }
        if (pStart > pEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pStart]);
        int center = 0;
        for (int i = iStart; i <= iEnd; i++) {
            if (inorder[i] == preorder[pStart]) {
                center = i;
            }
        }
        root.left = build(preorder, pStart + 1, pStart + center - iStart,
                inorder, iStart, center - 1);
        root.right = build(preorder, pStart + center - iStart + 1, pEnd,
                inorder, center + 1, iEnd);
        return root;
    }
}
