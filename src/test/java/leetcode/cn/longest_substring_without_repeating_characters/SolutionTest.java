package leetcode.cn.longest_substring_without_repeating_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "3, abcabcbb",
            "1, bbbbb",
            "3, pwwkew",
            "4, pewcek",
            "6, pewcekxze",
            "0, ''",
            "1, a",
            "2, au",
    })
    void test(int expected, String s) {
        Solution solution = new Solution();
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }
}
