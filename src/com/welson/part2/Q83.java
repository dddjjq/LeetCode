package com.welson.part2;

import com.welson.part1.ListNode;

/**
 * 82. 删除排序链表中的重复元素
 */
public class Q83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode backup = new ListNode(-1);
        ListNode preNode = head;
        backup.next = preNode;
        int cur = head.val;
        head = head.next;
        ListNode current;
        while (head != null) {
            if (head.val == cur) {
                current = null;
            } else {
                current = head;
            }
            cur = head.val;
            preNode.next = current;
            if (current != null) {
                preNode = preNode.next;
            }
            head = head.next;
        }
        return backup.next;
    }
}
