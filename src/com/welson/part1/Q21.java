package com.welson.part1;

public class Q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode preNode = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                preNode.next = l1;
                l1 = l1.next;
            } else {
                preNode.next = l2;
                l2 = l2.next;
            }
            preNode = preNode.next;
        }
        preNode.next = l1 == null ? l2 : l1;
        return result.next;
    }
}
