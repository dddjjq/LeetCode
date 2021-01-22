package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q41;
import com.welson.part2.Q42;
import com.welson.part2.Q43;
import com.welson.tree.Q94;
import com.welson.tree.TreeNodeFactory;

public class Main {

    public static void main(String[] args) {
        Q94 q38 = new Q94();
        int[] temp = new int[]{4,2,0,3,2,5};
        System.out.println(q38.inorderTraversal(TreeNodeFactory.createNormalTreeNode()));
    }

    public static ListNode createListNode() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        return listNode;
    }
}
