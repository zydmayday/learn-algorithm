package leetcode.cn.numbers_with_repeated_digits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "20, 1",
            "100, 10",
            "1000, 262",
    })
    void test(int n, int expected) {
        Solution solution = new Solution();
        assertEquals(expected, solution.numDupDigitsAtMostN(n));
    }
}
