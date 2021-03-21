package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q79;
import com.welson.part2.Q80;

public class Main {

    public static void main(String[] args) {
        Q80 q79 = new Q80();
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        char[][] test = new char[][]{
                {'a', 'b'}
        };
        System.out.println(q79.removeDuplicates(new int[]{0,0,1,1,1,1,2,2,3,3,3}));
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
