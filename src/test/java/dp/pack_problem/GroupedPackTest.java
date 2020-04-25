package dp.pack_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupedPackTest {

    @Test
    void test() {
        GroupedPack pack = new GroupedPack();
        int[] C = new int[]{2, 3, 4};
        int[] W = new int[]{3, 4, 5};
        int[][] G = new int[][]{
                {2, 3},
                {3, 4},
                {2, 4},
                {2, 3, 4}
        };
        int V = 10;
        assertEquals(14, pack.solution(C, W, G, V));
    }
}
