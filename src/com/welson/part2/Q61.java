package com.welson.part2;

import com.welson.part1.ListNode;

/**
 * 61. 旋转链表
 */
public class Q61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null){
            return null;
        }
        int length = getLength(head);
        int mod = k;
        if (length <= k) {
            mod = k % length;
        }
        if (mod == 0) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        int index = 0;
        while (fast != null && index < mod) {
            fast = fast.next;
            index++;
        }
        while (fast != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (pre != null) {
            pre.next = null;
        }
        ListNode result = slow;
        while (slow != null && slow.next != null) {
            slow = slow.next;
        }
        if (slow != null) {
            slow.next = head;
        }
        return result;
    }

    public int getLength(ListNode listNode) {
        int length = 0;
        while (listNode != null) {
            length++;
            listNode = listNode.next;
        }
        return length;
    }
}
