package leetcode.cn.best_time_to_buy_and_sell_stock;

import static java.lang.Integer.max;

public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int ans = 0;
        int min = prices[0];
        for (int cur : prices) {
            if (cur < min) min = cur;
            else ans = max(ans, cur - min);
        }
        return ans;
    }

}
