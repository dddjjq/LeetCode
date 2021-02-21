package com.welson;

import com.welson.part1.ListNode;
import com.welson.part1.Q6;
import com.welson.part2.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Q64 q38 = new Q64();
        //"ADOBECODEBANC"
        //"ABC"
        int[][] arr = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(q38.minPathSum(arr));
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
