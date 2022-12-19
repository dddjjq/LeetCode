package com.welson.part2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Q1971 {

    int[] visit;
    int visitCount;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        int length = edges.length;
        visit = new int[length];
        return dfs(edges, source, destination);
    }

    private boolean dfs(int[][] edges, int source, int destination) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            int[] sub = edges[i];
            if (visit[i] != 1) {
                if (sub[0] == source) {
                    if (sub[1] == destination) {
                        return true;
                    }
                    temp.add(sub[1]);
                    visit[i] = 1;
                    visitCount++;
                } else if (sub[1] == source) {
                    if (sub[0] == destination) {
                        return true;
                    }
                    temp.add(sub[0]);
                    visit[i] = 1;
                    visitCount++;
                }
                if (visitCount >= edges.length){
                    return false;
                }
            }
        }
        for (int i = 0; i < temp.size(); i++) {

            if (dfs(edges, temp.get(i), destination)) {
                return true;
            }
        }
        return false;
    }

}
