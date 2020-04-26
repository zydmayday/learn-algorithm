package leetcode.cn.perfect_squares;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "3, 12",
            "2, 13",
            "3, 123",
    })
    void test(int expected, int n) {
        Solution solution = new Solution();
        assertEquals(expected, solution.numSquares(n));
    }
}
