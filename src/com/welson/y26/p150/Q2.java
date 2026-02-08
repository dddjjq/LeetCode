package com.welson.y26.p150;

import com.welson.Main;
import com.welson.part1.ListNode;

import java.util.List;

public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = null;
        ListNode rl1 = l1;
        ListNode rl2 = l2;
        int remain = 0;
        boolean first = true;
        while (rl1 != null || rl2 != null) {
            int sum = 0;
            if (rl1 == null) {
                sum = rl2.val + remain;
                rl2 = rl2.next;
            } else if (rl2 == null) {
                sum = rl1.val + remain;
                rl1 = rl1.next;
            } else {
                sum = rl1.val + rl2.val + remain;
                rl1 = rl1.next;
                rl2 = rl2.next;
            }
            remain = sum / 10;
            sum = sum % 10;
            if (first) {
                result = new ListNode(sum);
                head = result;
                first = false;
            } else {
                result.next = new ListNode(sum);
                result = result.next;
            }
        }
        if (remain != 0) {
            result.next = new ListNode(remain);
            result = result.next;
        }
        return head;
    }

    public ListNode reverseNode(ListNode node) {
        ListNode tail = null;
        ListNode head = node;
        while (head != null) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = tail;
            tail = tmp;
        }
        return tail;
    }
}
