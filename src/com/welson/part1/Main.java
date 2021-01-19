package com.welson.part1;

import com.welson.part2.Q41;

public class Main {

    public static void main(String[] args) {
        Q41 q38 = new Q41();
        int[] temp = new int[]{0,3};
        System.out.println(q38.firstMissingPositive(temp));
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
