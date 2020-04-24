package dp.pack_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZeroOnePackTest {

    @Test
    void test() {
        ZeroOnePack pack = new ZeroOnePack();
        int[] C = new int[]{2,3,4,5};
        int[] W = new int[]{1,2,4,2};
        assertEquals(7, pack.solution1(C, W, 10));
        assertEquals(7, pack.solution2(C, W, 10));
    }

}
