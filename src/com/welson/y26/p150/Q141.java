package com.welson.y26.p150;

import com.welson.part1.ListNode;

public class Q141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null && fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else  {
                fast = null;
            }
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
