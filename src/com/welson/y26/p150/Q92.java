package com.welson.y26.p150;

import com.welson.part1.ListNode;

public class Q92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }

        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummy.next;
    }
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        ListNode curHead = head;
//        ListNode lastNode = new ListNode(0);
//        int index = 1;
//        while (curHead != null) {
//            if (index == left) {
//                lastNode.next = reverseK(curHead, right - left);
//                if (index == 1) {
//                    return lastNode.next;
//                }
//                return head;
//            }
//            lastNode = curHead;
//            curHead = curHead.next;
//            index++;
//        }
//        return head;
//    }
//
    public ListNode reverseK(ListNode head, int k) {
        ListNode tail = null;
        ListNode curHead = head;
        int index = k;
        while (curHead != null && index >= 0) {
            ListNode tmp = curHead.next;
            curHead.next = tail;
            tail = curHead;
            curHead = tmp;
            index--;
        }
        if (head != null && curHead != null) {
            head.next = curHead;
        }
        return tail;
    }

}
