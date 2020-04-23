package interview.coding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubMatrixStackTest {

    @Test
    void test() {
        MaxSubMatrixStack stack = new MaxSubMatrixStack();
        int[][] matrix = new int[][]{
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 0},
        };
        assertEquals(6, stack.maxSub(matrix));


        matrix = new int[][]{
                {1, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 0, 1},
                {0, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 1, 1},
                {1, 0, 0, 0, 1, 1},
        };
        assertEquals(6, stack.maxSub(matrix));
    }
}
