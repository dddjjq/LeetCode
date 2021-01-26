package com.welson;

import com.welson.part1.ListNode;
import com.welson.part1.Q674;
import com.welson.part2.Q46;
import com.welson.tree.*;

public class Main {

    public static void main(String[] args) {
        Q46 q38 = new Q46();
        int[] temp = new int[]{1,2,3};
        System.out.println(q38.permute(temp));
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
