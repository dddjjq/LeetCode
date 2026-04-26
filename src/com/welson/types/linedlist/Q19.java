package com.welson.types.linedlist;

import com.welson.part1.ListNode;

public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getLength(head);
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        prev.next = head;
        int cur = 0;
        while (head != null) {
            if (cur == len - n) {
                prev.next = head.next;
                break;
            }
            prev = head;
            head = head.next;
            cur++;
        }
        return dummy.next;
    }

    public int getLength(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}
