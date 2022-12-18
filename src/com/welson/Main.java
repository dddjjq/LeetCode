package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q82;
import com.welson.part3.Q1764;
import com.welson.part3.Q1775;
import com.welson.part3.Q1827;
import com.welson.part3.Q88;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Q1764 q1764 = new Q1764();
        int[][] group = new int[][]{
                {10, -2, 1},
                {1, 2, 3, 4}
        };
        int[] nums = new int[]{10, -2,  1, 2, 3, 4};
        System.out.println(q1764.canChoose(group, nums));
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
