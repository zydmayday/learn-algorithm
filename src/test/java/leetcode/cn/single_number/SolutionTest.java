package leetcode.cn.single_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
    }
}
