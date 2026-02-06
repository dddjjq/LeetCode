package com.welson.y26.p150;

public class Q122 {
    public int maxProfit(int[] prices) {
        int pre = 0;
        int res = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int add = Math.max(pre, pre + prices[i] - prices[i - 1]);
            res = Math.max(add, prices[i] - min);
            min = Math.min(min, prices[i]);
            pre = res;
        }
        return res;
    }
}
