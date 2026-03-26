package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.List;

public class Q228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int start = 0;
        int end = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[end] && nums[i] != nums[end] + 1) {
                res.add(getStr(nums, start, end));
                start = i;
            }
            end = i;
        }
        res.add(getStr(nums, start, end));
        return res;
    }

    private String getStr(int[] nums, int start, int end) {
        if (nums[start] == nums[end]) {
            return String.valueOf(nums[start]);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[start]);
            sb.append("->");
            sb.append(nums[end]);
            return sb.toString();
        }
    }
}
