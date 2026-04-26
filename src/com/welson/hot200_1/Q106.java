package com.welson.hot200_1;

import com.welson.tree.TreeNode;

import java.util.HashMap;


public class Q106 {

    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(postorder, postorder.length - 1, 0, postorder.length-1);
    }

    public TreeNode helper(int[] postOrder, int postIndex, int l, int r) {
        if (l > r) {
            return null;
        }
        int rootVal = postOrder[postIndex];
        int rootIndex = map.get(rootVal);
        int rightSize = r - rootIndex;
        TreeNode node = new TreeNode(rootVal);
        node.left = helper(postOrder, postIndex - rightSize - 1, l, rootIndex - 1);
        node.right = helper(postOrder, postIndex - 1, rootIndex + 1, r);
        return node;
    }
}
