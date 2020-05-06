package leetcode.cn.jump_game;

import static java.lang.Integer.max;

public class Solution {
    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) return false;
            k = max(k, i + nums[i]);
        }
        return true;
    }

    public int jump(int[] nums) {
        int step = 0;
        int k = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            k = max(k, nums[i] + i);
            if (i == end) {
                step++;
                end = k;
            }
        }
        return step;
    }
}
