package dp.pack_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DependentPackTest {

    @Test
    void test() {
        DependentPack pack = new DependentPack();
        int[] C = new int[]{2, 3, 4, 5, 6};
        int[] W = new int[]{3, 40, 5, 60, 10};
        int[][] D = new int[][]{
                {2, 4},
                {3}
        };
        int V = 15;
        assertEquals(108, pack.solution(C, W, D, V));
    }
}
