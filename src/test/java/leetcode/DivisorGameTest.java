package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisorGameTest {

    @ParameterizedTest
    @CsvSource({
            "true, 2",
            "false, 3",
            "true, 500",
    })
    void test(boolean expected, int N) {
        DivisorGame game = new DivisorGame();
        assertEquals(expected, game.divisorGame(N));
    }
}
