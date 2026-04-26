package com.welson.types.linedlist;

import com.sun.source.tree.Tree;
import com.welson.part1.ListNode;
import com.welson.tree.TreeNode;

import java.util.List;

public class Q109 {
//    public TreeNode sortedListToBST(ListNode head) {
//        int len = getLength(head);
//        return buildTree(head, len);
//    }
//
//    public TreeNode buildTree(ListNode node, int len) {
//        if (node == null) {
//            return null;
//        }
//        if (len < 0) {
//            return null;
//        }
//        if (len == 1) {
//            return new TreeNode(node.val);
//        }
//        if (len == 2) {
//            ListNode middleNode = node.next;
//            TreeNode root = new TreeNode(middleNode.val);
//            root.left = new TreeNode(node.val);
//            return root;
//        }
//        if (len == 3) {
//            ListNode middleNode = node.next;
//            TreeNode root = new TreeNode(middleNode.val);
//            root.left = new TreeNode(node.val);
//            root.right = new TreeNode(middleNode.next.val);
//            return root;
//        }
//        int mid = len / 2;
//        ListNode head = node;
//        for (int i = 0; i < mid; i++) {
//            node = node.next;
//        }
//        TreeNode root = new TreeNode(node.val);
//        root.left = buildTree(head, mid);
//        root.right = buildTree(node.next, len - mid - 1);
//        return root;
//    }
//
//
//    public int getLength(ListNode node) {
//        int len = 0;
//        while (node != null) {
//            node = node.next;
//            len++;
//        }
//        return len;
//    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return helper(head, null);
    }

    public TreeNode helper(ListNode head, ListNode tail) {
        if (head == tail) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(head, slow);
        root.right = helper(slow.next, tail);
        return root;
    }
}
