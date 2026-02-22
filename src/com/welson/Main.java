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
        Q135 q88 = new Q135();
        int[] nums1 = new int[]{1,0,2};
        System.out.println(q88.candy(nums1));
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
