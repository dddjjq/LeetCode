package com.welson.types.linedlist;

import com.welson.part1.ListNode;

public class Q83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            int val = cur.val;
            if (cur.next.val == val) {
                while (cur.next != null && cur.next.val == val) {
                    cur.next = cur.next.next;
                }
            } else  {
                cur = cur.next;
            }
        }
        return head;
    }
}
