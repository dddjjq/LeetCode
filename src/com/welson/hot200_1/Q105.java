package com.welson.hot200_1;

import com.welson.tree.TreeNode;

import java.util.HashMap;

public class Q105 {

    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int preIndex, int l, int r) {
        if (l > r) {
            return null;
        }
        int rootVal = preorder[preIndex];
        int rootIndex = map.get(rootVal);
        TreeNode node = new TreeNode(rootVal);
        int leftSize = rootIndex - l;
        node.left = helper(preorder, preIndex + 1, l, rootIndex - 1);
        node.right = helper(preorder, preIndex + leftSize + 1, rootIndex + 1, r);
        return node;
    }
}
