package leetcode.cn.maximum_subarray;

import static java.lang.Integer.max;

public class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // 根据动态规划的思想，前一个元素已经是最优，因为我们是从第一位开始遍历的
            // 如果前一个元素在最优的情况下仍然小于0，我们认为没有它更好，直接丢弃
            // 否则把前一个元素的值加到当前元素上
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            // 到目前为止的最优值和当前元素的最优值进行比较
            ans = max(ans, nums[i]);
        }
        return ans;
    }
}
