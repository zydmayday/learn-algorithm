package leetcode.cn.coin;

/*
硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
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

}
