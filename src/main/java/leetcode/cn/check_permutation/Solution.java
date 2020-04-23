package leetcode.cn.check_permutation;

public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] map = new char[26];
        char a = 'a';
        for (int i = 0; i < s1.length(); i++) {
            map[s1.charAt(i) - a]++;
            map[s2.charAt(i) - a]--;
        }
        for (char c : map) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
