package leetcode.cn.is_unique;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public boolean isUnique(String astr) {
        return "".equals(astr) || new HashSet<>(Arrays.asList(astr.split(""))).size() == astr.length();
    }
}
