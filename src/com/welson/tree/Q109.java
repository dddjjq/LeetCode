package com.welson.tree;

import com.welson.part1.ListNode;

public class Q109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode center = getCenter(head);
        return helper(head, center);
    }

    public ListNode getCenter(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ListNode endNode = head;
        ListNode preNode = new ListNode(-1);
        while (endNode != null && endNode.next != null) {
            endNode = endNode.next.next;
            preNode = node;
            node = node.next;
        }
        preNode.next = null;
        return node;
    }

    public TreeNode helper(ListNode left, ListNode right) {
        if (right == null) {
            return null;
        }
        if (left.val == right.val) {
            return new TreeNode(left.val);
        }
        TreeNode treeNode = new TreeNode(right.val);
        ListNode center = getCenter(left);
        treeNode.left = helper(left, center);
        ListNode center1 = getCenter(right.next);
        treeNode.right = helper(right.next, center1);
        return treeNode;
    }
}
