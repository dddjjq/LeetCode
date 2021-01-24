package com.welson.tree;

public class Q106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder, 0, inorder.length - 1,
                0, postorder.length - 1);
    }

    public TreeNode build(int[] inorder, int[] postorder, int inStart, int inEnd,
                          int postStart, int postEnd) {
        if (postStart > postEnd) {
            return null;
        }
        int rootVal = postorder[postEnd];
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        int leftSize = index - inStart;
        TreeNode treeNode = new TreeNode(rootVal);
        treeNode.left = build(inorder, postorder, inStart, index - 1
                , postStart, postStart + leftSize - 1);
        treeNode.right = build(inorder, postorder, index + 1, inEnd
                , postStart + leftSize, postEnd - 1);
        return treeNode;
    }
}
