package com.welson.types.linedlist;

import com.welson.part1.ListNode;

import java.util.List;
import java.util.PriorityQueue;

public class Q23 {

    class Status implements Comparable<Status> {
        int val;
        ListNode node;

        public Status(int val, ListNode node) {
            this.val = val;
            this.node = node;
        }

        @Override
        public int compareTo(Status o) {
            return val - o.val;
        }
    }

    private PriorityQueue<Status> queue = new PriorityQueue<>();

    public ListNode mergeKLists(ListNode[] lists) {
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(new Status(node.val, node));
            }
        }
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        while (!queue.isEmpty()) {
            Status status = queue.poll();
            prev.next = status.node;
            prev = prev.next;
            if (status.node.next != null) {
                queue.offer(new Status(status.node.next.val, status.node.next));
            }
        }
        return dummy.next;
    }
}
