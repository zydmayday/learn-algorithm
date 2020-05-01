package leetcode.cn.happy_number;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.pow;

public class Solution {
    public boolean isHappy(int n) {
        int ans = n;
        Set<Integer> exists = new HashSet<>();
        while (!exists.contains(ans)) {
            exists.add(ans);
            ans = next(ans);
        }
        return ans == 1;
    }

    private int next(int n) {
        int ans = 0;
        while (n > 0) {
            ans += pow((n % 10), 2);
            n /= 10;
        }
        return ans;
    }
}
