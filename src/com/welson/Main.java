package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q82;
import com.welson.part3.Q1775;
import com.welson.part3.Q88;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Q88 q88 = new Q88();
        int[] num1 = new int[]{2,0};
        int[] num2 = new int[]{1};
        q88.merge(num1,1, num2,1);
        System.out.println(Arrays.toString(num1));
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
