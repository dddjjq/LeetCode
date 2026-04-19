package com.welson.y26.p150;

import java.util.*;

public class Q207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
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
            count++;
            for (int neighbor : graph.get(poll)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }
        return count == numCourses;
    }
}
