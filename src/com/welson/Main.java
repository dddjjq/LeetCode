package com.welson;

public class Main {

    public static void main(String[] args) {
        Q27 q23 = new Q27();
        ListNode listNode = createListNode();
        System.out.println(q23.removeElement(new int[]{0,1,2,2,4,3,0,2},2));
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
