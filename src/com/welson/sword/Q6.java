package com.welson.sword;

import com.welson.part1.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        int len = getLength(head);
        int[] arr = new int[len];
        int index = arr.length - 1;
        while (head != null) {
            arr[index--] = head.val;
            head = head.next;
        }
        return arr;
    }

    public int getLength(ListNode listNode) {
        int len = 0;
        while (listNode != null) {
            len++;
            listNode = listNode.next;
        }
        return len;
    }
}
