package leetcode.cn.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.max;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int ans = 0;
        int head = 0;
        int tail = 0;
        Map<Character, Integer> used = new HashMap<>();
        while (tail < chars.length) {
            char curChar = chars[tail];
            if (!used.containsKey(curChar)) {
                // 如果不包含这个字母，将字母加入used，并且tail++
                used.put(curChar, tail++);
            } else {
                // 如果包含这个字母，更新当前的最大长度
                // 并且head移动到这个字母的下一个位置
                // 并且去除掉从原head到新head中间所有的used的数据
                ans = max(ans, tail - head);
                int newHead = used.get(curChar) + 1;
                while (head < newHead) {
                    used.remove(chars[head++]);
                }
            }
        }
        return max(ans, tail - head);
    }
}
