package interview.coding.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ClosestMaxAndMinIndexStackTest {
    ClosestMaxAndMinIndexStack stack = new ClosestMaxAndMinIndexStack();

    @Test
    void test() {
        int[] arr = new int[]{3, 4, 1, 5, 6, 2, 7};
        int[][] expected = new int[][]{
                {-1, 2},
                {0, 2},
                {-1, -1},
                {2, 5},
                {3, 5},
                {2, -1},
                {5, -1}};
        System.out.println(Arrays.deepToString(stack.execute(arr)));
        assertArrayEquals(expected, stack.execute(arr));
    }
}
