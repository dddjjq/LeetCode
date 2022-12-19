package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q1971;
import com.welson.part2.Q1971_2;
import com.welson.part2.Q82;
import com.welson.part3.Q1764;
import com.welson.part3.Q1775;
import com.welson.part3.Q1827;
import com.welson.part3.Q88;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Q1971_2 q1971 = new Q1971_2();
        int[][] group = new int[][]{
                {4, 3},
                {1, 4},
                {4, 8},
                {1, 7},
                {6, 4},
                {4, 2},
                {7, 4},
                {4, 0},
                {0, 9},
                {5, 4},
        };
        System.out.println(q1971.validPath(10, group, 5, 10));
    }


    public static ListNode createListNode() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next.next = new ListNode(5);
        return listNode;
    }
}
