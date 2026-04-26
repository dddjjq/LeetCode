package com.welson.types.linedlist;

import com.welson.part1.ListNode;

import java.util.List;
import java.util.Stack;

public class Q143 {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<ListNode> stack = new Stack<>();
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = null;
        if (slow != null) {
            cur = slow.next;
            while (cur != null) {
                stack.push(cur);
                ListNode tmp = cur.next;
                cur.next = null;
                cur = tmp;
            }
            slow.next = null;
        }
        ListNode prev = head;
        while (head != null && prev != slow && !stack.isEmpty()) {
            ListNode tmp = prev.next;
            ListNode tail = stack.pop();
            prev.next = tail;
            tail.next = tmp;
            prev = tmp;
        }
    }

}
