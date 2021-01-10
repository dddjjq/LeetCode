package com.welson;

import java.util.List;

/**
 * 24. 两两交换链表中的节点
 */
public class Q24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null){
            return head;
        }
        int index = 0;
        ListNode currentNode = head;
        ListNode result = new ListNode(-1);
        ListNode preNode = result;
        while (currentNode.next != null) {
            ListNode next = currentNode.next;
            if (index % 2 == 0) {
                preNode.next = next;
                currentNode.next = next.next;
                next.next = currentNode;
                preNode = preNode.next;
            } else {
                preNode = currentNode;
                currentNode = currentNode.next;
            }
            index++;
        }
        return result.next;
    }
}
