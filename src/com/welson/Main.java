package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q41;
import com.welson.part2.Q42;
import com.welson.part2.Q43;

public class Main {

    public static void main(String[] args) {
        Q43 q38 = new Q43();
        int[] temp = new int[]{4,2,0,3,2,5};
        System.out.println(q38.multiply("123","200"));
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
