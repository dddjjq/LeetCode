package com.welson.part1;

/**
 * 23. 合并K个升序链表(hard)
 * 1、顺序合并
 * 2、分而治之
 */
public class Q23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return divide(lists);
    }

    public ListNode divide(ListNode[] listNodes) {
        if (listNodes.length == 1) {
            return listNodes[0];
        }
        ListNode[] listNodes1 = new ListNode[listNodes.length / 2 + listNodes.length % 2];
        for (int i = 0; i < listNodes.length / 2; i++) {
            listNodes1[i] = mergeTwo(listNodes[i * 2], listNodes[i * 2 + 1]);
        }
        if (listNodes.length % 2 == 1) {
            listNodes1[listNodes1.length - 1] = listNodes[listNodes.length - 1];
        }
        return divide(listNodes1);
    }

    public ListNode mergeTwo(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(-1);
        ListNode pre = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        pre.next = l1 == null ? l2 : l1;
        return listNode.next;
    }
}
