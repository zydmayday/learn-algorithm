package dp.pack_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplePackTest {

    @Test
    void test() {
        MultiplePack pack = new MultiplePack();
        int[] C = new int[]{2, 3, 4, 5};
        int[] W = new int[]{3, 4, 5, 6};
        int[] M = new int[]{4, 30, 40, 20};
        assertEquals(14, pack.solution1(C, W, M, 10));
    }
}
