package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Q12 {

    /**
     * 输入：num = 3749
     * <p>
     * 输出： "MMMDCCXLIX"
     */


    int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] strs = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

//    public String intToRoman(int num) {
//        int remain = num;
//        StringBuilder res = new StringBuilder();
//        int index = 0;
//        while (remain != 0) {
//            for (int i = index; i <nums.length; i++) {
//                int cur = nums[i];
//                if (remain >= cur) {
//                    int temp = remain / cur;
//                    remain = remain % cur;
//                    res.append(String.valueOf(strs[i]).repeat(Math.max(0, temp)));
//                    break;
//                } else {
//                    index = i;
//                }
//            }
//        }
//        return res.toString();
//    }

    public String intToRoman(int num) {
        int remain = num;
        StringBuilder res = new StringBuilder();
        int count = 0;
        while (remain != 0) {
            while (remain - nums[count] >= 0) {
                res.append(strs[count]);
                remain = remain - nums[count];
            }
            count++;
        }
        return res.toString();
    }
}
