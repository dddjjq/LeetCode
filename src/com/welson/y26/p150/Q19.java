package com.welson.y26.p150;

import com.welson.part1.ListNode;

public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int index = 0;
        ListNode cur = head;
        int size = getLen(head);
        if (size - n - 1 < 0){
            return head.next;
        }
        while (cur != null) {
            if (index == size - n - 1) {
                ListNode temp = cur.next;
                if (temp != null) {
                    cur.next = temp.next;
                }
            }
            index++;
            cur = cur.next;
        }
        return head;
    }

    public int getLen(ListNode node) {
        ListNode tmp = node;
        int len = 0;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }
}
