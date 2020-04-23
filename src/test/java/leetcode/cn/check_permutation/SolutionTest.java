package leetcode.cn.check_permutation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "true, abc, bca",
            "false, abc, bad",
    })
    void test(boolean expected, String s1, String s2) {
        Solution solution = new Solution();
        assertEquals(expected, solution.CheckPermutation(s1, s2));
    }
}
