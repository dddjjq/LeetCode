package com.welson.y26.p150;

import com.welson.tree.TreeNode;

import java.util.HashMap;

public class Q106 {

    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeInner(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode buildTreeInner(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
        if (iStart > iEnd) {
            return null;
        }
        int rootVal = postorder[pEnd];
        int rootIndex = map.get(rootVal);
        int left = rootIndex - iStart;
        TreeNode node = new TreeNode(rootVal);
        node.left = buildTreeInner(inorder, iStart, rootIndex - 1, postorder, pStart, pStart + left - 1);
        node.right = buildTreeInner(inorder, rootIndex+1, iEnd, postorder, pStart + left, pEnd - 1);
        return node;
    }
}
