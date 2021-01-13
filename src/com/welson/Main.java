package com.welson;

public class Main {

    public static void main(String[] args) {
        Q29 q23 = new Q29();
        ListNode listNode = createListNode();
        System.out.println(q23.divide(Integer.MIN_VALUE,2));
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
