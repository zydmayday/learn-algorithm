package leetcode.cn.happy_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "true, 19",
    })
    void test(boolean expected, int n) {
        Solution solution = new Solution();
        assertEquals(expected, solution.isHappy(n));
    }
}
