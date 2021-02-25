package com.welson;

import com.welson.part1.ListNode;
import com.welson.sort.*;
import com.welson.sword.Q4;
import com.welson.sword.Q7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Q7 sort = new Q7();
        int[][] arr = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println(sort.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7}));
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
