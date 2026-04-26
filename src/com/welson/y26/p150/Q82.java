package com.welson.y26.p150;

import com.welson.part1.ListNode;

import java.util.Stack;

public class Q82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next;
            } else  {
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
