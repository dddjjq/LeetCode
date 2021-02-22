package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.*;

public class Main {

    public static void main(String[] args) {
        Q72 q38 = new Q72();
        //"ADOBECODEBANC"
        //"ABC"
        int[][] arr = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(q38.minDistance("horse","ros"));
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
