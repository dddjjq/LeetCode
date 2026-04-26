package com.welson.types.linedlist;

import com.welson.part1.ListNode;

public class Q82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        prev.next = head;
        while (head != null) {
            if (head.next != null && head.next.val == head.val) {
                while (head.next != null && head.next.val == head.val) {
                    int val = head.val;
                    while (head != null && head.val == val) {
                        head = head.next;
                    }
                    prev.next = head;
                }
            } else {
                prev = head;
                head = head.next;
            }
        }
        return dummy.next;
    }
}
