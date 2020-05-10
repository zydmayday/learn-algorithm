package leetcode.cn.sum.two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{0, 3}, solution.twoSum(new int[]{2, 7, 11, 15}, 17));
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 7, 11, 15}, 18));
        assertArrayEquals(new int[]{1, 3}, solution.twoSum(new int[]{2, 7, 11, 15}, 22));
        assertArrayEquals(new int[]{0, 4}, solution.twoSum(new int[]{0, 3, -3, 4, -1}, -1));
    }
}
