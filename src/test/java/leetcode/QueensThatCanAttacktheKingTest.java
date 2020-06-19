package leetcode;

import leetcode.en.QueensThatCanAttacktheKing;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueensThatCanAttacktheKingTest {

    @Test
    void test() {
        int[][] queens = new int[][]{{5, 6}, {7, 7}, {2, 1}, {0, 7}, {1, 6}, {5, 1}, {3, 7}, {0, 3}, {4, 0}, {1, 2}, {6, 3}, {5, 0}, {0, 4}, {2, 2}, {1, 1}, {6, 4}, {5, 4}, {0, 0}, {2, 6}, {4, 5}, {5, 2}, {1, 4}, {7, 5}, {2, 3}, {0, 5}, {4, 2}, {1, 0}, {2, 7}, {0, 1}, {4, 6}, {6, 1}, {0, 6}, {4, 3}, {1, 7}};
        int[] king = new int[]{3, 4};

        int[][] expected = new int[][]{{2, 3}, {1, 4}, {1, 6}, {3, 7}, {4, 3}, {5, 4}, {4, 5}};
        QueensThatCanAttacktheKing game = new QueensThatCanAttacktheKing();
        List<List<Integer>> expectedList = new ArrayList<>();
        for (int i = 0; i < expected.length; i++) {
            expectedList.add(new ArrayList<>());
            for (int j = 0; j < expected[0].length; j++) {
                expectedList.get(i).add(j);
            }
        }
        assertEquals(expectedList, game.queensAttacktheKing(queens, king));
    }
}
