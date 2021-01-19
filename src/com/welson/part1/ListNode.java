package com.welson.part1;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.val);
            stringBuilder.append("->");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
