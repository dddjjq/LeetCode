package com.welson.part2;

public class Q1971_2 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        UnionFind find = new UnionFind(n);
        for (int[] sub : edges) {
            find.union(sub[0], sub[1]);
        }
        return find.connect(source, destination);
    }

    class UnionFind {
        private int[] parent;
        private int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootY != rootX) {
                if (rank[x] > rank[y]) {
                    parent[rootY] = rootX;
                } else if (rank[x] < rank[y]) {
                    parent[rootX] = rootY;
                } else {
                    parent[rootY] = rootX;
                    rank[x]++;
                }
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                return find(parent[x]);
            }
            return parent[x];
        }

        public boolean connect(int x, int y) {
            return find(x) == find(y);
        }
    }
}
