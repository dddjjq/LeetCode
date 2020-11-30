package com.welson;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 示例 4:
 * 输入: s = ""
 * 输出: 0
 * <p>
 * 提示：
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int max = 0;
        for (; end < chars.length; end++) {
            char alpha = s.charAt(end);
            if (charMap.containsKey(alpha)) {
                start = Math.max(charMap.get(alpha), start);
            }
            max = Math.max(max, end - start + 1);
            charMap.put(s.charAt(end), end + 1);
        }
        return max;
    }

    public int lengthOfLongestSubstringSolution1(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            String temp = "";
            for (int j = i; j < chars.length; j++) {
                if (temp.indexOf(chars[j]) == -1) {
                    temp = s.substring(i, j + 1);
                } else {
                    break;
                }
            }
            max = Math.max(max, temp.length());
        }
        return max;
    }
}
