package com.welson.y26.p150;

import com.welson.tree.TreeNode;

import java.util.HashMap;

public class Q105 {

//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < inorder.length; i++) {
//            map.put(inorder[i], i);
//        }
//        return buildTreeInner(preorder, 0, preorder.length, inorder, 0, inorder.length, map);
//    }
//
//    public TreeNode buildTreeInner(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd, HashMap<Integer, Integer> map) {
//        if (pStart == pEnd) {
//            return null;
//        }
//        int rootVal = preorder[pStart];
//        TreeNode root = new TreeNode(rootVal);
//        int iRootIndex = map.get(rootVal);
//        int leftNum = iRootIndex - iStart;
//        root.left = buildTreeInner(preorder, pStart + 1, pStart + leftNum + 1, inorder, iStart, iRootIndex, map);
//        root.right = buildTreeInner(preorder, pStart + leftNum + 1, pEnd, inorder, iRootIndex + 1, iEnd, map);
//        return root;
//    }

    HashMap<Integer, Integer> map = new HashMap<>();
    int preOrderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeInner(preorder, 0, preorder.length);
    }

    public TreeNode buildTreeInner(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootVal = preorder[preOrderIndex++];
        int index = map.get(rootVal);
        TreeNode node = new TreeNode(rootVal);
        node.left = buildTreeInner(preorder, left, index - 1);
        node.right = buildTreeInner(preorder, index + 1, right);
        return node;
    }
}
