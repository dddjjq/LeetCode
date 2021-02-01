package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q438;
import com.welson.part2.Q76;

public class Main {

    public static void main(String[] args) {
        Q438 q38 = new Q438();
        //"ADOBECODEBANC"
        //"ABC"
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(q38.findAnagrams("cbaebabacd","abc"));
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
