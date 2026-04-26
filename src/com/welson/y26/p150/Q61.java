package com.welson.y26.p150;

import com.welson.part1.ListNode;

public class Q61 {
    public ListNode rotateRight(ListNode head, int k) {
        int len = getLen(head);
        if (len == 0) {
            return head;
        }
        int target = k % len;
        ListNode cur = head;
        int index = 0;
        while (cur != null) {
            if (len - target - 1 == index) {
                ListNode prev = cur.next;
                ListNode temp = prev;
                cur.next = null;
                while (temp != null) {
                    if (temp.next == null) {
                        temp.next = head;
                        return prev;
                    } else {
                        temp = temp.next;
                    }
                }
            }
            index++;
            cur = cur.next;
        }
        return head;
    }

    public int getLen(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}
