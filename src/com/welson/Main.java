package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q51;
import com.welson.part2.Q53;

public class Main {

    public static void main(String[] args) {
        Q53 q38 = new Q53();
        System.out.println(q38.maxSubArray(new int[]{-1,-2}));
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
