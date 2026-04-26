package com.welson.types.linedlist;

import com.welson.part1.ListNode;

public class Q25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        int index = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        int len = getLength(head);
        int count = len / k;
        while (head != null && index < count) {
            ListNode[] res = reverse(head, k);
            prev.next = res[0];
            head = res[2];
            prev = res[1];
            index++;
        }
        prev.next = head;
        return dummy.next;
    }

    public ListNode[] reverse(ListNode node, int k) {
        ListNode prev = null;
        int index = 0;
        ListNode first = node;
        while (node != null && index < k) {
            ListNode tmp = node.next;
            node.next = prev;
            prev = node;
            node = tmp;
            index++;
        }
        return new ListNode[]{prev, first, node};
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
