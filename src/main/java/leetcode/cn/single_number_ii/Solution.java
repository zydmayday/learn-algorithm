package leetcode.cn.single_number_ii;

public class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    bitCount++;
                }
            }
            if (bitCount % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
