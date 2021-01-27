package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q51;

public class Main {

    public static void main(String[] args) {
        Q51 q38 = new Q51();
        int[] temp = new int[]{1, 1, 1, 1, 3};
        System.out.println(q38.solveNQueens(8).size());
    }

    public static ListNode createListNode() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        return listNode;
    }
}
