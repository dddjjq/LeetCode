package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q146 {

    class DNode {
        DNode prev;
        DNode next;
        int val;
        int key;

        public DNode(DNode prev, DNode next, int val) {
            this.prev = prev;
            this.next = next;
            this.val = val;
        }

        public DNode() {
        }

    }

    class LRUCache {

        HashMap<Integer, DNode> maps;
        DNode head = new DNode();
        DNode tail = new DNode();
        int capacity;

        public LRUCache(int capacity) {
            maps = new HashMap<>();
            this.capacity = capacity;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DNode node = maps.get(key);
            if (node == null) {
                return -1;
            }
            moveToHead(node);
            return node.val;
        }

        public void moveToHead(DNode node) {
            removeNode(node);
            insertHead(node);
        }

        private void removeNode(DNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void insertHead(DNode node) {
            DNode tmp = head.next;
            head.next = node;
            tmp.prev = node;
            node.prev = head;
            node.next = tmp;
        }

        public void put(int key, int value) {
            DNode node = maps.get(key);
            if (node == null) {
                node = new DNode();
                node.val = value;
                node.key = key;
                insertHead(node);
                maps.put(key, node);
                if (maps.size() > capacity) {
                    DNode remove = removeTail();
                    maps.remove(remove.key);
                }
            } else {
                node.val = value;
                moveToHead(node);
            }

        }

        public DNode removeTail() {
            DNode target = tail.prev;
            removeNode(target);
            return target;
        }
    }
}
