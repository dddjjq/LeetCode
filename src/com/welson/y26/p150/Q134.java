package com.welson.y26.p150;

public class Q134 {


    //输入: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = gas[0];
        boolean valid = true;
        for (int j = 1; j < n + 1; j++) {
            int target = j % n;
            int costBefore = cost[(j - 1 + n) % n];
            if (total < costBefore) {
                valid = false;
                break;
            }
            total = total + gas[target] - costBefore;
        }
        if (total >= gas[0] && valid) {
            return 0;
        }
        for (int j = 1; j < n; j++) {
            int costBefore = cost[j - 1];
            if (total < cost[j - 1]) {
                total = total + gas[j] - gas[j - 1] - cost[j - 1];
                continue;
            }
            total = total + gas[j] - gas[j - 1] - cost[j - 1];
            if (total >= gas[j]) {

            }
        }

        return -1;
    }
}
