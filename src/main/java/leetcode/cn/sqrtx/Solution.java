package leetcode.cn.sqrtx;

public class Solution {
    public int mySqrt(int x) {
        long a = 0;
        long b = x / 2 + 1;
        while (a < b) {
            long m = (a + b + 1) / 2;
            long s = m * m;
            if (s > x) {
                b = m - 1;
            } else {
                a = m;
            }
        }
        return (int) a;
    }
}
