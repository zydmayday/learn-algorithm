package leetcode.cn.sqrtx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "2,4",
            "2,8",
            "1,1",
            "3,15",
            "46340,2147395600",
    })
    void test(int expected, int x) {
        Solution solution = new Solution();
        assertEquals(expected, solution.mySqrt(x));
    }
}
