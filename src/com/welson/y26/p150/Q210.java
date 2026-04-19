package com.welson.y26.p150;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Q210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int pre = prerequisite[1];
            graph.get(course).add(pre);
            indegree[pre]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            res.add(0,poll);
            count++;
            for (int neighbor : graph.get(poll)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }
        if (res.size() != numCourses) {
            return new int[0];
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
