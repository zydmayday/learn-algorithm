package leetcode.cn.coin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "2, 5",
            "4, 10",
            "140430, 999",
    })
    void test(int expected, int n) {
        Solution solution = new Solution();
        assertEquals(expected, solution.waysToChange(n));
        assertEquals(expected, solution.solution(n));
    }
}
