package com.welson.part1;


/**
 * 25. K 个一组翻转链表
 */
public class Q25 {

    public ListNode reverseKGroup(ListNode node, int k) {
        if (k == 1) {
            return node;
        }
        if (getLength(node) < k) {
            return node;
        }
        ListNode pre = null;
        int index = 0;
        while (node != null && index < k) {
            ListNode temp = node.next;
            node.next = pre;
            pre = node;
            node = temp;
            index++;
        }
        if (pre != null) {
            ListNode temp = pre.next;
            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = reverseKGroup(node, k);
            }
        }
        return pre;
    }

    public int getLength(ListNode node) {
        int index = 0;
        while (node != null) {
            index++;
            node = node.next;
        }
        return index;
    }
}
