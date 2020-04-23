package leetcode.cn.string_to_integer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public int myAtoi(String str) {
        Matcher matcher = Pattern.compile("^[+|-]?\\d+").matcher(str.trim());
        if (matcher.find()) {
            str = matcher.group();
        } else {
            return 0;
        }
        int ans;
        try {
            ans = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            if (str.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        return ans;
    }

    // 自动机思路
    public int myAtoiDFA(String str) {
        int ans = 0;
        int sign = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ');
            else if (c == '+' || c == '-') {
                sign = -1;
            } else if (48 <= c || c <= 57) {
                ans = ans * 10 + c;
            } else {
                break;
            }

        }
        return ans;
    }
}
