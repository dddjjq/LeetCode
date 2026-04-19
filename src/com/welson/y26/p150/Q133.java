package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q133 {

    private class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    Map<Integer, Node> map = new HashMap<>();


    public Node cloneGraph(Node node) {
        if (node == null){
            return null;
        }
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }
        Node newNode = new Node(node.val);
        map.put(node.val, newNode);
        List<Node> oldNeighbors = node.neighbors;
        List<Node> newNeighbors = new ArrayList<>();
        for (Node n : oldNeighbors) {
            newNeighbors.add(cloneGraph(n));
        }
        newNode.neighbors = newNeighbors;
        return node;
    }
}
