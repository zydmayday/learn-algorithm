package leetcode.cn.shu_zu_zhong_shu_zi_chu_xian_de_ci_shu;

public class Solution {
    public int[] singleNumbers(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        // ans = a ^ b;
        int offset = 0;
        while ((xor & 1) == 0) {
            offset++;
            xor >>= 1;
        }
        int left = 0;
        int right = 0;
        for (int num : nums) {
            if (((num >> offset) & 1) == 1) {
                left ^= num;
            } else {
                right ^= num;
            }
        }
        return new int[]{left, right};
    }
}
