package leetcode.cn.sum.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (m.containsKey(c)) return new int[] {m.get(c), i};
            else m.put(nums[i], i);
        }
        return null;
    }
}
