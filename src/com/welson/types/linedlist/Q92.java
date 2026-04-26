package com.welson.types.linedlist;

import com.welson.part1.ListNode;

public class Q92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int index = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        while (head != null && index < left - 1) {
            prev = head;
            head = head.next;
            index++;
        }
        int k = right - left + 1;
        ListNode[] res = reverseK(head, k);
        prev.next = res[0];
        res[1].next = res[2];
        return dummy.next;
    }

    public ListNode[] reverseK(ListNode node, int k) {
        ListNode prev = null;
        ListNode first = node;
        int index = 0;
        while (node != null && index < k) {
            ListNode tmp = node.next;
            node.next = prev;
            prev = node;
            node = tmp;
            index++;
        }
        return new ListNode[]{prev, first, node};
    }
}
