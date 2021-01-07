package com.welson;

public class Main {

    public static void main(String[] args) {
        Q21 Q21 = new Q21();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(5);
        System.out.println(Q21.mergeTwoLists(listNode1,listNode2));
    }
}
