package leetcode.cn.is_unique;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "false, leetcode",
            "true, abce",
            "true, ''",
    })
    void test(boolean expected, String s) {
        Solution solution = new Solution();
        assertEquals(expected, solution.isUnique(s));
    }
}
