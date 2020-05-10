package leetcode.cn.sum.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (a > 0) break;
            if (i > 0 && a == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if (a + b > 0) break;
                if (j > i + 1 && b == nums[j - 1]) continue;
                if (bs(nums, -(a + b), j + 1) != -1) {
                    ans.add(Arrays.asList(a, b, -(a + b)));
                }
            }
        }
        return ans;
    }

    private int bs(int[] nums, int t, int start) {
        int l = start;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == t) return m;
            if (nums[m] > t) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }
}
