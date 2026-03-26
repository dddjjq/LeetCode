package com.welson.y26.p150;

import com.welson.part1.ListNode;

public class Q21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
        }
        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null) {
            temp.next = list2;
        }
        return newNode.next;
    }
}
