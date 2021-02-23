package com.welson;

import com.welson.part1.ListNode;
import com.welson.sort.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ISort sort = new Heap();
        int[] arr = new int[]{2, 6, 4, 5, 3, 1, 8, 6, 9, 9, 10, 15, 9, 7};
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
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
