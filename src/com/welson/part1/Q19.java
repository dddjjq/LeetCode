package com.welson.part1;

public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = getNodeLength(head);
        ListNode temp = head;
        int index = 0;
        ListNode pre = null;
        while (temp != null) {
            if (index == length - n) {
                if (pre == null) {
                    head = temp.next;
                } else {
                    pre.next = temp.next;
                }
                break;
            } else {
                pre = temp;
                temp = temp.next;
                index++;
            }
        }
        return head;
    }

    public int getNodeLength(ListNode node) {
        int sum = 0;
        while (node != null) {
            sum++;
            node = node.next;
        }
        return sum;
    }
}
