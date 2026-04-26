package com.welson.types.linedlist;

import com.welson.part1.ListNode;

public class Q61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int len = getLength(head);
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;

        int index = 0;
        cur = head;
        while (index < len - k % len) {
            cur = cur.next;
            index++;
        }

        ListNode tmp = cur.next;
        cur.next = null;
        return tmp;
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
