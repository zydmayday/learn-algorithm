package leetcode.cn.perfect_squares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.min;
import static java.lang.Math.pow;

public class Solution {

    // 变种背包问题
    // 可以简单地转化为完全背包问题进行求解
    // 所有的元素
    public int numSquares(int n) {
        // 找出所有的小于n的完全平方数存放到squares中
        List<Integer> squares = new ArrayList<>();
        int num = 1;
        while (pow(num, 2) <= n) {
            squares.add((int) pow(num++, 2));
        }
        // 初始化DP用的数组，其中除了首位之外其余位都设置为无穷大，为了防止溢出这里设置为n(其实最坏的情况就是全部用1的情况)
        // 目的在于完全背包为题中，我们需要找到正好能塞满背包的组合，
        // 对于那些不能“正好”塞满的情况，我们认为不可用，所以尽可能设置成较大值，
        // F[0]表示为背包容量为空的情况，自然什么也不用放，所以可能设置成0作为起点
        int[] F = new int[n + 1];
        Arrays.fill(F, n);
        F[0] = 0;
        for (int i = 1; i <= squares.size(); i++) {
            int c = squares.get(i - 1);
            for (int v = c; v <= n; v++) {
                F[v] = min(F[v], F[v - c] + 1);
            }
        }
        return F[n];
    }
}
