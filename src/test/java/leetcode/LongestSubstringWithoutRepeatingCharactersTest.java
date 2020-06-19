package leetcode;

import leetcode.en.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @CsvSource({
            "3, abcabcbb",
            "1, bbbbb",
            "3, pwwkew",
    })
    void test(int expected, String s) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }



    @ParameterizedTest
    @CsvSource({
            "3, abcabcbb",
            "1, bbbbb",
            "3, pwwkew",
    })
    void testMapversion(int expected, String s) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(expected, solution.mapVersion(s));
    }
}
