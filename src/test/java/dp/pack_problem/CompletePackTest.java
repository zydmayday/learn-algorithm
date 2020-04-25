package dp.pack_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompletePackTest {

    @Test
    void test() {
        CompletePack pack = new CompletePack();
        int[] C = new int[]{2, 3, 4, 5};
        int[] W = new int[]{1, 3, 4, 2};
        assertEquals(10, pack.solution1(C, W, 10));
        assertEquals(10, pack.solution2(C, W, 10));
    }
}
