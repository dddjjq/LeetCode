package com.welson;

public class Main {

    public static void main(String[] args) {
        Q38 q38 = new Q38();
        System.out.println(q38.countAndSay(5));
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
