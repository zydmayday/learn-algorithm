package leetcode.cn.string_to_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "-42, '    -42'",
            "4193, '4193 with words'",
            "0, 'with words 987'",
            "-2147483648, '-91283472332'",
            "2147483647, '20000000000000000000'",
            "2147483647, '10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000522545459'",
            "12345678, '  0000000000012345678'",
            "10, '  010'",
            "0, '      0000000000000   '",
    })
    void test(int expected, String str) {
        Solution solution = new Solution();
        assertEquals(expected, solution.myAtoi(str));
    }

}
