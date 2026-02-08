package com.welson;

import com.welson.part1.ListNode;
import com.welson.part2.Q1971;
import com.welson.part2.Q1971_2;
import com.welson.part2.Q82;
import com.welson.part3.Q1764;
import com.welson.part3.Q1775;
import com.welson.part3.Q1827;
import com.welson.y26.p150.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ListNode node  = createListNode2();
        Q92 q2 = new Q92();
        int[] nums1 = new int[]{1,2,3,4,5};
        ListNode node2 = createListNode3();
        System.out.println(q2.reverseBetween(node2,2,3));
//        System.out.println(Arrays.toString(nums1));
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

    public static ListNode createListNode2() {
        ListNode listNode = new ListNode(3);
        return listNode;
    }

    public static ListNode createListNode3() {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(6);
        listNode.next.next = new ListNode(4);
        return listNode;
    }
}
