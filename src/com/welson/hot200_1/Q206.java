package com.welson.hot200_1;

import com.welson.part1.ListNode;

public class Q206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }
}
