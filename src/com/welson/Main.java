package com.welson;

import com.welson.part1.ListNode;
import com.welson.part1.Q674;
import com.welson.tree.*;

public class Main {

    public static void main(String[] args) {
        Q674 q38 = new Q674();
        int[] temp = new int[]{4, 2, 0, 3, 2, 5};
        System.out.println(q38.findLengthOfLCIS(new int[]{2,2,2,2,2}));
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
