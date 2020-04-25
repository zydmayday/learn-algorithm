package leetcode.cn.coin;

import java.util.Arrays;

import static java.lang.Integer.max;

/*
硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
https://leetcode-cn.com/problems/coin-lcci/solution/ying-bi-by-leetcode-solution/
 */
public class Solution {

    // 不使用递归
    // 原来并不是所有的动态规划都要使用递归来解
    public int waysToChange(int n) {
        int[] coins = new int[]{1, 5, 10, 25};
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= n; j++) {
                if (j - coins[i] >= 0) {
                    dp[j] += dp[j - coins[i]];
                }
            }
        }
        return dp[dp.length - 1] % 1_000_000_007;
    }

    public int solution(int n) {
        int[] coins = new int[]{1, 5, 10, 25};
        int[] F = new int[n + 1];
        for (int i = 0; i < coins.length; i++) {
            for (int c = coins[i]; c <= n; c++) {
                F[c] = max(F[c], F[c - coins[i]] + 1);
            }
        }
        System.out.println(Arrays.toString(F));
        return F[n];
    }

}
