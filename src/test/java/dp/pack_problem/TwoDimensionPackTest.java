package dp.pack_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDimensionPackTest {

    @Test
    void testZeroOne() {
        TwoDimensionPack pack = new TwoDimensionPack();
        int[] C = new int[]{1, 2, 3};
        int[] D = new int[]{2, 1, 4};
        int[] W = new int[]{2, 4, 6};
        int V = 8;
        int U = 6;
        assertEquals(10, pack.solutionZeroOne(C, D, W, V, U));
    }

    @Test
    void testComplete() {
        TwoDimensionPack pack = new TwoDimensionPack();
        int[] C = new int[]{1, 2, 3};
        int[] D = new int[]{2, 1, 4};
        int[] W = new int[]{2, 4, 6};
        int V = 8;
        int U = 6;
        assertEquals(16, pack.solutionComplete(C, D, W, V, U));
    }
}
