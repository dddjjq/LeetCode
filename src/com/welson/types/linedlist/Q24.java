package com.welson.types.linedlist;

import com.welson.part1.ListNode;

public class Q24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        dummy.next = head;

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null) {
            ListNode tmp = fast.next;
            slow.next = fast.next;
            fast.next = slow;
            prev.next = fast;

            prev = slow;
            slow = slow.next;
            fast = (slow != null) ? slow.next : null;
        }
        return dummy.next;
    }

}
