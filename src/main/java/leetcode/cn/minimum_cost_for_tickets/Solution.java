package leetcode.cn.minimum_cost_for_tickets;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days[days.length - 1] + 1];
        int[] D = new int[]{1, 7, 30};
        int idx = 0;
        for (int i = 1; i < dp.length; i++) {
            if (i == days[idx]) {
                int m = Integer.MAX_VALUE;
                for (int j = 0; j < costs.length; j++) {
                    int k = max(0, i - D[j]);
                    m = min(m, dp[k] + costs[j]);
                }
                dp[i] = m;
                idx++;
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[dp.length - 1];
    }
}
