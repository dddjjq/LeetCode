package com.welson.y26.p150;

import com.welson.part1.ListNode;

import java.util.List;

public class Q86 {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode();
        ListNode small = smallHead;
        ListNode largeHead = new ListNode();
        ListNode large = largeHead;
        ListNode targetNode = null;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }
}
