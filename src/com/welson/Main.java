package com.welson;

import com.welson.part1.ListNode;
import com.welson.sort.*;
import com.welson.sword.Q4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Q4 sort = new Q4();
        int[][] arr = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println(sort.findNumberIn2DArray(arr,40));
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
