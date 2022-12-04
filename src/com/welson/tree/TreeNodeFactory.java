package com.welson.tree;

public class TreeNodeFactory {

    static TreeNode t1 = new TreeNode(1);
    static TreeNode t2 = new TreeNode(2);
    static TreeNode t3 = new TreeNode(3);
    static TreeNode t4 = new TreeNode(4);
    static TreeNode t5 = new TreeNode(5);
    static TreeNode t6 = new TreeNode(6);
    static TreeNode t7 = new TreeNode(7);

    public static TreeNode createNormalTreeNode() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        treeNode.left = node2;
        treeNode.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        return treeNode;
    }

    public static TreeNode create1() {
        TreeNode treeNode = new TreeNode(5);
        TreeNode t4 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
        TreeNode t3 = new TreeNode(3);
        TreeNode t7 = new TreeNode(7);
        treeNode.left = t4;
        treeNode.right = t6;
        t6.left = t3;
        t6.right = t7;
        return treeNode;
    }

    public static TreeNode create2() {
        TreeNode t2 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        t2.left = t1;
        t2.right = t3;
        return t2;
    }

    public static TreeNode create4() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t21 = new TreeNode(2);
        TreeNode t22 = new TreeNode(2);
        TreeNode t23 = new TreeNode(2);
        TreeNode t24 = new TreeNode(2);
        t1.left = t21;
        t1.right = t22;
        t21.left = t23;
        t22.left = t24;
        return t1;
    }

    public static TreeNode create3() {
        reset();
        t3.left = t1;
        t3.right = t4;
        t4.left = t2;
        return t3;
    }

    public static TreeNode create5() {
        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(2);
        TreeNode t24 = new TreeNode(4);
        t22.left = t21;
        t22.right = t24;
        return t22;
    }

    public static TreeNode create6() {
        TreeNode t1 = new TreeNode(0);
        TreeNode t21 = new TreeNode(1);
        TreeNode t23 = new TreeNode(3);
        t21.left = t1;
        t21.right = t23;
        return t21;
    }

    public static void reset() {
        t1.left = null;
        t2.left = null;
        t3.left = null;
        t4.left = null;
        t5.left = null;
        t6.left = null;
        t7.left = null;
        t1.right = null;
        t2.right = null;
        t3.right = null;
        t4.right = null;
        t5.right = null;
        t6.right = null;
        t7.right = null;
    }
}
