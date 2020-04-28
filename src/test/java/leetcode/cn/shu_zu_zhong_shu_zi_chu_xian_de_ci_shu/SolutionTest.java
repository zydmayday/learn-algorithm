package leetcode.cn.shu_zu_zhong_shu_zi_chu_xian_de_ci_shu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 6}, solution.singleNumbers(new int[]{4, 1, 4, 6}));
    }
}
