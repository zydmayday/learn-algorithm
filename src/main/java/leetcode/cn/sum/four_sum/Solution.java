package leetcode.cn.sum.four_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (i > 0 && a == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if (j > i + 1 && b == nums[j - 1]) continue;
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int n = a + b + nums[l] + nums[r];
                    if (n == target) {
                        ans.add(Arrays.asList(a, b, nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (n > target) {
                        r--;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else {
                        l++;
                        while (l < r && nums[l] == nums[l - 1]) l++;
                    }
                }
            }
        }
        return ans;
    }
}
