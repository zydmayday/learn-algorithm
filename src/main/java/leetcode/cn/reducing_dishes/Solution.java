package leetcode.cn.reducing_dishes;

import java.util.Arrays;

// hard
public class Solution {

    public int maxSatisfaction(int[] satisfaction) {
        int ans = 0;
        int sum = 0;
        Arrays.sort(satisfaction);
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            sum += satisfaction[i];
            if (sum < 0) break;
            ans += sum;
        }
        return ans;
    }
}
