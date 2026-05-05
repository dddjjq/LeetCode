package com.welson.hot200_1;

import java.util.ArrayList;
import java.util.List;

public class Q93 {

    public List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        dfs(new StringBuilder(), s, 0, 0);
        List<String> ans = new ArrayList<>();
        for (String str : result) {
            ans.add(str.substring(0,str.length() - 1));
        }
        return ans;
    }

    public void dfs(StringBuilder sb, String s, int index, int cnt) {
        if (cnt == 4) {
            if (sb.length() == s.length() + 4) {
                result.add(sb.toString());
            }
            return;
        }
        if (index >= s.length()) {
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (index + i > s.length()) {
                return;
            }
            String split = s.substring(index, index + i);
            if (isValid(split)) {
                sb.append(split);
                sb.append(".");
                dfs(sb, s, index + i, cnt + 1);
                sb.delete(sb.length() - split.length() - 1, sb.length());
            }
        }
    }

    public String getIp(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public boolean isValid(String s) {
        if (s.length() > 1 && s.startsWith("0")) {
            return false;
        }
        if (Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }
}
