package com.welson.part2;

import java.util.ArrayList;
import java.util.List;

public class Q60 {

    private final List<String> list = new ArrayList<>();
    private final List<Integer> visit = new ArrayList<>();
    private final StringBuilder sb = new StringBuilder();
    private int mCurrentIndex = 0;

    public String getPermutation(int n, int k) {
        dfs(n,k);
        if (list.size() > k - 1) {
            return list.get(k - 1);
        }
        return null;
    }

    public void dfs(int n, int k) {
        if (mCurrentIndex == k) {
            return;
        }
        if (visit.size() == n) {
            list.add(sb.toString());
            mCurrentIndex++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visit.contains(i)) {
                continue;
            }
            visit.add(i);
            sb.append(i);
            dfs(n, k);
            visit.remove(visit.get(visit.size() - 1));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
