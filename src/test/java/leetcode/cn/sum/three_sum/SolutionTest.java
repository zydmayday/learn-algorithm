package leetcode.cn.sum.three_sum;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
//        solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(solution.threeSum(new int[]{-1, 0, -1, 0, 2, 2, 2, 3, -3, 3, 4, -4, 4}));
    }
}
